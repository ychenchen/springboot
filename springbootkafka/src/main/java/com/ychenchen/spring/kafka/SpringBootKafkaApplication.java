package com.ychenchen.spring.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alexis.Yang
 * @descriptioin starter
 * @date 2019-08-20 10:15
 * @copyright www.ychenchen.com
 */
@SpringBootApplication
@Configuration
public class SpringBootKafkaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootKafkaApplication.class, args);
    }
}
