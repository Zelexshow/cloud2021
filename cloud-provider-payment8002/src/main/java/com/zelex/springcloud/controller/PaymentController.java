package com.zelex.springcloud.controller;

import com.zelex.springcloud.entities.CommonResult;
import com.zelex.springcloud.entities.Payment;
import com.zelex.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


/**
 * @Author Zelex
 * @Date 2021/3/3 20:06
 * @Version 1.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){

        int result = paymentService.create(payment);
        log.info("*****插入结果："+result);

        if (result>0){
            return new CommonResult(200,"插入数据库成功"+serverPort,result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment result = paymentService.getPaymentById(id);
        log.info(serverPort+"*****查找结果："+result);

        if (result!=null){
            return new CommonResult(200,"查询成功"+serverPort,result);
        }else {
            return new CommonResult(444,"没有对应记录ID:"+id,null);
        }
    }

}
