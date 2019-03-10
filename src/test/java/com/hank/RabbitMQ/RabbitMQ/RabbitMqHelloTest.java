package com.hank.RabbitMQ.RabbitMQ;

import com.hank.RabbitMQ.RabbitMQ.directExchange.HelloSender;
import com.hank.RabbitMQ.RabbitMQ.directExchange.ObjectSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqHelloTest {
    @Autowired
    private HelloSender helloSender;

    @Test
    public void hello() throws Exception {
        helloSender.send();
        Thread.sleep(1000l);
    }

    @Autowired
    private ObjectSender sender;


    @Test
    public void sendOject() throws Exception {
        User user=new User();
        user.setName("testUser");
        user.setPass("123456");
        sender.send(user);
        Thread.sleep(1000l);
    }
}