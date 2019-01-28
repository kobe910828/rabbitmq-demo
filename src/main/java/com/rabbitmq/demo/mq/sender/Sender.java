package com.rabbitmq.demo.mq.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2018/10/30 10:17
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String msg = "hello world!";
        System.out.println("sender:" + msg);
        rabbitTemplate.convertAndSend("hello", msg);
    }
}
