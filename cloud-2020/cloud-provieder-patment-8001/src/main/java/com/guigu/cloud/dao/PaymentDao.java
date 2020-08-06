package com.guigu.cloud.dao;

import com.guigu.cloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    Payment selectById(@Param("id") Long id);

    int savePayment(Payment payment);

}
