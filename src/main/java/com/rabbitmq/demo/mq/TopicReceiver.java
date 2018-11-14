package com.rabbitmq.demo.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2018/11/14 14:48
 */
@Component
@RabbitListener(queues = "topic.message")
public class TopicReceiver {
    @RabbitHandler
    public void process(String message) {
        System.out.println("Topic Receiver1  : " + message);
    }
}
