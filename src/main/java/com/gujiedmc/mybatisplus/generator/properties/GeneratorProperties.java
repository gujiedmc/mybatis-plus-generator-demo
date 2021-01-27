package com.gujiedmc.mybatisplus.generator.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.io.Serializable;

/**
 * 生成代码的配置
 *
 * @author gujiedmc
 * @date 2021-01-26
 */
@Data
@ConfigurationProperties(prefix = "generator")
public class GeneratorProperties implements Serializable {

    /**
     * 创建人
     */
    private String author;
    /**
     * 数据库相关配置
     */
    @NestedConfigurationProperty
    private DataSourceProperties datasource;

    /**
     * 包名相关配置
     */
    @NestedConfigurationProperty
    private PackageNameProperties packageName = new PackageNameProperties();

    /**
     * 类名后缀配置
     */
    @NestedConfigurationProperty
    private ClassNameSuffixProperties classNameSuffix = new ClassNameSuffixProperties();

    /**
     * 继承类配置
     */
    @NestedConfigurationProperty
    private SupperClassProperties supperClass = new SupperClassProperties();

    /**
     * 模板配置
     */
    @NestedConfigurationProperty
    private TemplateProperties template = new TemplateProperties();

    /**
     * 生成策略配置
     */
    @NestedConfigurationProperty
    private StrategyProperties strategy = new StrategyProperties();
}
