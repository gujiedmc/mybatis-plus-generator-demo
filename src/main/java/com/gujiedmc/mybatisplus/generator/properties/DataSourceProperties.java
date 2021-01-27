package com.gujiedmc.mybatisplus.generator.properties;

import lombok.Data;

import java.io.Serializable;

/**
 * 数据库相关配置
 *
 * @author gujiedmc
 * @date 2021-01-26
 */
@Data
public class DataSourceProperties implements Serializable {

    /**
     * 数据库地址
     */
    private String url;
    /**
     * 数据库用户名
     */
    private String username;
    /**
     * 数据库密码
     */
    private String password;
}
