package com.gujiedmc.mybatisplus.generator.properties;

import lombok.Data;

import java.io.Serializable;

/**
 * 生成策略相关配置
 *
 * @author gujiedmc
 * @date 2021-01-27
 */
@Data
public class StrategyProperties implements Serializable {

    /**
     * 表明前缀
     */
    private String tablePrefix;
    /**
     * 需要生成的表，支持正则，和exclude二选一
     */
    private String[] include;
    /**
     * 不需要生成的表，支持正则，和include 二选一
     */
    private String[] exclude;

    /**
     * 启用lombok
     */
    private Boolean lombok = Boolean.TRUE;

    /**
     * 是否删除boolean类型字段在数据库中的is前缀
     */
    private Boolean removeBooleanColumnIsPrefix = Boolean.FALSE;
}
