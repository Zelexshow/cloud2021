package com.zelex.springcloud.service;


import com.zelex.springcloud.entities.Payment;

/**
 * @Author Zelex
 * @Date 2021/3/3 19:47
 * @Version 1.0
 */
public interface PaymentService {
    int create(Payment payment);//插入操作
    Payment getPaymentById(Long id);//查找订单
}
