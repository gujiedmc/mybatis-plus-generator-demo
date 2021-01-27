package com.gujiedmc.mybatisplus.generator;

import com.gujiedmc.mybatisplus.generator.builder.CodeAutoGeneratorBuilder;
import com.gujiedmc.mybatisplus.generator.properties.GeneratorProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 使用mybatis-plus-generator生成代码
 *
 * @author gujiedmc
 * @date 2021-01-26
 */
@Slf4j
@SpringBootApplication
public class MybatisPlusGeneratorApplication implements CommandLineRunner {

    @Autowired
    private GeneratorProperties generatorProperties;

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusGeneratorApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("项目启动。生成规则如下：{}", generatorProperties);
        log.info("执行生成...");
        CodeAutoGeneratorBuilder.create(generatorProperties)
                .build().execute();
        log.info("执行结束");
    }
}
