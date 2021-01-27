package com.gujiedmc.mybatisplus.generator.properties;

import lombok.Data;

import java.io.Serializable;

/**
 * 模板配置，指定模板的位置，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
 * {@link com.baomidou.mybatisplus.generator.config.TemplateConfig}
 *
 * @author gujiedmc
 * @date 2021-01-27
 */
@Data
public class TemplateProperties implements Serializable {

    /**
     * controller 模板
     */
    private String controller = "/templates/controller.java";
    /**
     * 业务接口模板
     */
    private String service = "/templates/service.java";
    /**
     * 业务实现模板
     */
    private String serviceImpl = "/templates/serviceImpl.java";
    /**
     * mapper模板
     */
    private String mapper = "/templates/mapper.java";
    /**
     * 实体模板
     */
    private String entity = "/templates/entity.java";
    /**
     * xml模板
     */
    private String xml = "/templates/mapper.xml";
}
