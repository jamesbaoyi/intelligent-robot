package cn.fintecher.robot.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@EntityScan({"cn.fintecher.robot.common.entity*"})
public class RobotDomainApplication {

    private static final Logger logger = LoggerFactory.getLogger(RobotDomainApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(RobotDomainApplication.class);
        Environment env = app.run(args).getEnvironment();
        try {
            logger.info("\n----------------------------------------------------------\n\t" +
                            "Application '{}' is running! Access URLs:\n\t" +
                            "Local: \t\thttp://localhost:{}\n\t" +
                            "External: \thttp://{}:{}\n\t" +
                            "SwaggerUI: \thttp://localhost:{}/swagger-ui.html\n" +
                            "----------------------------------------------------------",
                    env.getProperty("spring.application.name"),
                    env.getProperty("server.port"),
                    InetAddress.getLocalHost().getHostAddress(),
                    env.getProperty("server.port"),
                    env.getProperty("server.port"));
        } catch (UnknownHostException e) {
            logger.error(e.getMessage(), e);
        }
    }
}
