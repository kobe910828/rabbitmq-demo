package com.rabbitmq.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2018/11/14 14:33
 */
@Configuration
public class RabbitTopic {
    private final static String MESSAGE = "topic.message";
    private final static String MESSAGES = "topic.messages";

    /**
     * 创建队列
     * @return queueMessage
     */
    @Bean
    public Queue queueMessage() {
        return new Queue(RabbitTopic.MESSAGE);
    }
    /**
     * 创建队列
     * @return queueMessages
     */
    @Bean
    public Queue queueMessages() {
        return new Queue(RabbitTopic.MESSAGES);
    }

    /**
     * 创建交换器
     * @return exchange
     */
    @Bean
    TopicExchange exchange() {
        return new TopicExchange("topicExchange");
    }
    /**
     * 队列queueMessage绑定到exchange交换器
     * @return bindingExchangeQueue
     */
    @Bean
    Binding bindingExchangeQueue(Queue queueMessage, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
    }
    /**
     * 队列queueMessages绑定到exchange交换器
     * @return bindingExchangeQueues
     */
    @Bean
    Binding bindingExchangeQueues(Queue queueMessages, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.*");
    }
}
