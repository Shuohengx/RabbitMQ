package com.hank.RabbitMQ.RabbitMQ.topicExchange;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.messages")
public class TopicReceiverTwo {
    @RabbitHandler
    public void Process(String message){
        System.out.println("Topic Receiver2 :"+message);
    }
}
