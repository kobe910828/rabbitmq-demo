package com.rabbitmq.demo.mq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2018/11/14 14:49
 */
@Component
@RabbitListener(queues = "topic.messages")
public class TopicReceiver2 {
    @RabbitHandler
    public void process(String message) {
        System.out.println("Topic Receiver2  : " + message);
    }
}
