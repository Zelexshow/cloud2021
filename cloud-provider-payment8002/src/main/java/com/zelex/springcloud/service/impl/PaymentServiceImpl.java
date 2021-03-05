package com.zelex.springcloud.service.impl;

import com.zelex.springcloud.dao.PaymentDao;
import com.zelex.springcloud.entities.Payment;
import com.zelex.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author Zelex
 * @Date 2021/3/3 20:01
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
