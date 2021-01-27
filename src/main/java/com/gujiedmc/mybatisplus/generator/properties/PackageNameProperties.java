package com.gujiedmc.mybatisplus.generator.properties;

import lombok.Data;

import java.io.Serializable;

/**
 * 包名相关配置
 *
 * @author gujiedmc
 * @date 2021-01-26
 */
@Data
public class PackageNameProperties implements Serializable {
    /**
     * 基础包名
     */
    private String base;
    /**
     * 模块名称
     */
    private String module;
    /**
     * controller包名
     */
    private String controller = "controller";
    /**
     * 业务接口包名
     */
    private String service = "service";
    /**
     * 业务实现包名
     */
    private String serviceImpl = "service.impl";
    /**
     * mapper包名
     */
    private String mapper = "mapper";
    /**
     * xml包名
     */
    private String xml = "mapper.xml";
    /**
     * 实体包名
     */
    private String entity = "entity";
}
