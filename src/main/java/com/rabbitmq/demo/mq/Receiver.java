package com.rabbitmq.demo.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2018/10/30 10:20
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("receiver:"+hello);
    }
}
