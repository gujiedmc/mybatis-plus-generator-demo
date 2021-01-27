package com.gujiedmc.mybatisplus.generator.properties;

import lombok.Data;

import java.io.Serializable;

/**
 * 父类相关配置
 * 各个类的父类，如果为空，则不继承
 *
 * @author gujiedmc
 * @date 2021-01-26
 */
@Data
public class SupperClassProperties implements Serializable {

    /**
     * controller父类
     */
    private String controller;
    /**
     * 业务接口父类
     */
    private String service;
    /**
     * 业务实现父类
     */
    private String serviceImpl;
    /**
     * mapper父类
     */
    private String mapper;
    /**
     * 实体父类
     */
    private String entity;

}
