package com.zelex.springcloud.dao;

import com.zelex.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Zelex
 * @Date 2021/3/3 19:46
 * @Version 1.0
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);//插入操作
    Payment getPaymentById(@Param("id") Long id);//查找订单

}
