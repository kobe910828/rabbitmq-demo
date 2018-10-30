package com.rabbitmq.demo;

import com.rabbitmq.demo.mq.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqDemoTest {
    @Autowired
    private Sender sender;

    @Test
    public void hello() {
        sender.send();
    }
}
