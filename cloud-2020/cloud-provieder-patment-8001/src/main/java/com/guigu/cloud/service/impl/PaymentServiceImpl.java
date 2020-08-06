package com.guigu.cloud.service.impl;

import com.guigu.cloud.dao.PaymentDao;
import com.guigu.cloud.entity.Payment;
import com.guigu.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname PaymentServiceImpl
 * @Description TODO
 * @Date 2020/8/6 23:22
 * @Created by wali
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public Payment selectById(Long id) {
        return paymentDao.selectById(id);
    }

    @Override
    public int savePayment(Payment payment) {
        return paymentDao.savePayment(payment);
    }
}
