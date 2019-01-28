package com.rabbitmq.demo.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/1/28 16:10
 */
@Data
public class Order implements Serializable{
    /** 订单id **/
    private String orderId;
    /** 订单状态 0：未支付，1：已支付，2：订单已取消 **/
    private Integer orderStatus;
    /** 订单名字 **/
    private String orderName;
}
