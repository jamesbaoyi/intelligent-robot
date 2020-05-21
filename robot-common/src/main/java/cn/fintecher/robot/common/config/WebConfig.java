package cn.fintecher.robot.common.config;

import cn.fintecher.robot.common.config.CurrentUserInfoMethodArgumentResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private RequestMappingHandlerAdapter handlerAdapter;


    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new StringHttpMessageConverter());
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(currentUserMethodArgumentResolver());

    }

    @Bean
    public CurrentUserInfoMethodArgumentResolver currentUserMethodArgumentResolver() {
        return new CurrentUserInfoMethodArgumentResolver();
    }

    @PostConstruct
    public void addConversionConfig() {
        ConfigurableWebBindingInitializer initializer = (ConfigurableWebBindingInitializer) handlerAdapter.getWebBindingInitializer();
        if (Objects.requireNonNull(initializer).getConversionService() != null) {
            GenericConversionService genericConversionService = (GenericConversionService) initializer.getConversionService();
            Objects.requireNonNull(genericConversionService).addConverter(String.class, Date.class, source -> {
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    return sdf.parse(source);
                } catch (Exception ignored) {
                }
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    return sdf.parse(source);
                } catch (Exception ignored) {
                }
                try {
                    return new Date(Long.parseLong(source));
                } catch (Exception ignored) {
                }
                return null;
            });
        }
    }
}
