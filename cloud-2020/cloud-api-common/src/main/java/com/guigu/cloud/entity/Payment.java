package com.guigu.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Classname Payment
 * @Description 付款实体类
 * @Date 2020/8/6 23:11
 * @Created by wali
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private Long id;

    private String serial;

}
