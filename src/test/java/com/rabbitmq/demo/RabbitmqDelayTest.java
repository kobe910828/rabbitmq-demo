package com.rabbitmq.demo;

import com.rabbitmq.demo.domain.Order;
import com.rabbitmq.demo.mq.sender.DelaySender;
import com.rabbitmq.demo.mq.sender.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqDelayTest {
    @Autowired
    private DelaySender delaySender;

    @Test
    public void delayQueueTest() {
        Order order1 = new Order();
        order1.setOrderStatus(0);
        order1.setOrderId("123456");
        order1.setOrderName("小米6");

        Order order2 = new Order();
        order2.setOrderStatus(1);
        order2.setOrderId("456789");
        order2.setOrderName("小米8");

        delaySender.sendDelay(order1);
        delaySender.sendDelay(order2);
    }
}
