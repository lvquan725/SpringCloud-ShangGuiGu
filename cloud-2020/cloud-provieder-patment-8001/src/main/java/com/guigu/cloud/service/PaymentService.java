package com.guigu.cloud.service;

import com.guigu.cloud.entity.Payment;

public interface PaymentService {

    /**
     * 根据id 查询支付信息
     * @param id id
     * @return 支付信息实体
     */
    Payment selectById(Long id);

    /**
     * 保存支付信息
     * @param payment 支付实体
     * @return 返回是否插入成功，success 1 ， failure 0
     */
    int savePayment(Payment payment);

}
