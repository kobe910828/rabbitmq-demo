package com.rabbitmq.demo.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2018/11/14 14:44
 */
@Component
public class TopicSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String msg = "hi, i am message";
        System.out.println("Sender : " + msg);
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.1", msg);
    }

    public void send1() {
        String msg = "hi, i am message 1";
        System.out.println("Sender : " + msg);
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.message", msg);
    }

    public void send2() {
        String msg = "hi, i am messages 2";
        System.out.println("Sender : " + msg);
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.messages", msg);
    }
}
