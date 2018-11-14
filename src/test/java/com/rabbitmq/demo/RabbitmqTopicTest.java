package com.rabbitmq.demo;

import com.rabbitmq.demo.mq.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqTopicTest {
    @Autowired
    private TopicSender sender;

    @Test
    public void topic() {
        sender.send();
    }

    @Test
    public void topic1() {
        sender.send1();
    }

    @Test
    public void topic2() {
        sender.send2();
    }
}
