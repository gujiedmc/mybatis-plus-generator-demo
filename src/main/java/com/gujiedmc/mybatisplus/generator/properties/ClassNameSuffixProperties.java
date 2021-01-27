package com.gujiedmc.mybatisplus.generator.properties;

import lombok.Data;

import java.io.Serializable;

/**
 * 类名后缀配置
 *
 * @author gujiedmc
 * @date 2021-01-26
 */
@Data
public class ClassNameSuffixProperties implements Serializable {

    /**
     * controller类名后缀
     */
    private String controller = "Controller";
    /**
     * 业务接口类名后缀
     */
    private String service = "Service";
    /**
     * 业务实现类名后缀
     */
    private String serviceImpl = "ServiceImpl";
    /**
     * mapper类名后缀
     */
    private String mapper = "Mapper";
    /**
     * 实体类名后缀
     */
    private String entity = "Entity";
    /**
     * xml文件名称后缀
     */
    private String xml = "Mapper";
}
