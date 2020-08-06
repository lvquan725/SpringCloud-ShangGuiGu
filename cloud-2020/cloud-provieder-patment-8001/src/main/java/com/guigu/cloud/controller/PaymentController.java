package com.guigu.cloud.controller;

import com.guigu.cloud.common.ApiResult;
import com.guigu.cloud.common.ApiResultCode;
import com.guigu.cloud.common.ApiResultDesc;
import com.guigu.cloud.entity.Payment;
import com.guigu.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.guigu.cloud.common.ApiResultCode.*;
import static com.guigu.cloud.common.ApiResultDesc.FIND_SUCCESS;
import static com.guigu.cloud.common.ApiResultDesc.INSERT_SUCCESS;

/**
 * @Classname PaymentController
 * @Description TODO
 * @Date 2020/8/6 23:24
 * @Created by wali
 */
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment/{id}")
    public ApiResult<Payment> getPayment(@PathVariable("id") Long id){
        Payment payment = paymentService.selectById(id);
        return new ApiResult<>(SUCCESS, payment, FIND_SUCCESS);
    }

    @PostMapping("/payment/save")
    public ApiResult<Integer> savePayment(Payment payment){
        int i = paymentService.savePayment(payment);
        return new ApiResult<>(SUCCESS, i, INSERT_SUCCESS);
    }


}
