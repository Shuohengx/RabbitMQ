package com.hank.RabbitMQ.RabbitMQ.Config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class RabbitConfiguration {
    @Bean
    public Queue Queue() {
        return new Queue("hello");
    }

    @Bean
    public Queue objectQueue() {
        return new Queue("object");
    }
}