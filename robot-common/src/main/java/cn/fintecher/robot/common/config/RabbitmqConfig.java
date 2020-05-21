package cn.fintecher.robot.common.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfig {

    @Bean
    public Queue sendQueue() {
        return new org.springframework.amqp.core.Queue("task", true);
    }

    @Bean
    public Queue receiveQueue() {
//        System.out.println("task_response 实例创建成功");
        return new Queue("task_response", true);
    }

    @Bean
    public FanoutExchange basicExchange() {
//        System.out.println("task_response 交换机创建成功");
        return new FanoutExchange("task", true, false);
    }

    @Bean
    Binding bindingExchangeSend() {
        return BindingBuilder.bind(sendQueue()).to(basicExchange());
    }

    @Bean
    Binding bindingExchangeReceive() {
//        System.out.println("task_response 绑定交换机成功");
        return BindingBuilder.bind(receiveQueue()).to(basicExchange());
    }

}
