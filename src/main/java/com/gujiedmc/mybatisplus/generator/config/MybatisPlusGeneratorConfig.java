package com.gujiedmc.mybatisplus.generator.config;

import com.gujiedmc.mybatisplus.generator.properties.GeneratorProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 装载生成规则配置
 *
 * @author gujiedmc
 * @date 2021-01-26
 */
@EnableConfigurationProperties(GeneratorProperties.class)
@Configuration
public class MybatisPlusGeneratorConfig {
}
