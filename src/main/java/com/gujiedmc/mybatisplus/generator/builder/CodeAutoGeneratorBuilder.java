package com.gujiedmc.mybatisplus.generator.builder;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.builder.ConfigBuilder;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;
import com.gujiedmc.mybatisplus.generator.properties.*;

/**
 * 代码生成器
 *
 * @author gujiedmc
 * @date 2021-01-27
 */
public class CodeAutoGeneratorBuilder {

    private CodeAutoGeneratorBuilder() {
    }

    /**
     * 代码生成配置
     */
    private GeneratorProperties generatorProperties;

    /**
     * 创建builder
     *
     * @param generatorProperties 生成配置
     * @return builder
     */
    public static CodeAutoGeneratorBuilder create(GeneratorProperties generatorProperties) {
        CodeAutoGeneratorBuilder codeAutoGeneratorBuilder = new CodeAutoGeneratorBuilder();
        codeAutoGeneratorBuilder.generatorProperties = generatorProperties;
        return codeAutoGeneratorBuilder;
    }

    /**
     * 构建生成器
     *
     * @return 生成器
     */
    public AutoGenerator build() {

        AutoGenerator autoGenerator = new AutoGenerator();

        autoGenerator.setStrategy(strategyConfig());
        autoGenerator.setGlobalConfig(globalConfig());
        autoGenerator.setDataSource(dataSourceConfig());
        autoGenerator.setPackageInfo(packageConfig());
        autoGenerator.setTemplate(templateConfig());
        autoGenerator.setTemplateEngine(new VelocityTemplateEngine());
        autoGenerator.setConfig(new ConfigBuilder(
                autoGenerator.getPackageInfo(), autoGenerator.getDataSource(), autoGenerator.getStrategy(),
                autoGenerator.getTemplate(), autoGenerator.getGlobalConfig()
        ));

        return autoGenerator;
    }


    private static final String CLASS_NAME_PLACE_HOLDER = "%s";

    /**
     * 全局配置。
     */
    private GlobalConfig globalConfig() {

        ClassNameSuffixProperties classNameSuffix = generatorProperties.getClassNameSuffix();

        GlobalConfig globalConfig = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        globalConfig.setOutputDir(projectPath + "/src/main/java");

        globalConfig.setOutputDir(projectPath);
        globalConfig.setFileOverride(false);
        globalConfig.setOpen(false);
        globalConfig.setAuthor(generatorProperties.getAuthor());
        globalConfig.setBaseResultMap(false);
        globalConfig.setDateType(DateType.ONLY_DATE);
        globalConfig.setBaseColumnList(false);
        globalConfig.setEntityName(CLASS_NAME_PLACE_HOLDER + classNameSuffix.getEntity());
        globalConfig.setMapperName(CLASS_NAME_PLACE_HOLDER + classNameSuffix.getMapper());
        globalConfig.setXmlName(CLASS_NAME_PLACE_HOLDER + classNameSuffix.getXml());
        globalConfig.setServiceName(CLASS_NAME_PLACE_HOLDER + classNameSuffix.getService());
        globalConfig.setServiceImplName(CLASS_NAME_PLACE_HOLDER + classNameSuffix.getServiceImpl());
        globalConfig.setControllerName(CLASS_NAME_PLACE_HOLDER + classNameSuffix.getController());

        return globalConfig;
    }

    /**
     * 数据源配置
     */
    private DataSourceConfig dataSourceConfig() {

        DataSourceProperties datasource = generatorProperties.getDatasource();

        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
        dataSourceConfig.setUrl(datasource.getUrl());
        dataSourceConfig.setUsername(datasource.getUsername());
        dataSourceConfig.setPassword(datasource.getPassword());

        return dataSourceConfig;
    }

    /**
     * 包名配置
     */
    private PackageConfig packageConfig() {
        PackageNameProperties packageName = generatorProperties.getPackageName();

        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent(packageName.getBase());
        packageConfig.setModuleName(packageName.getModule());
        packageConfig.setEntity(packageName.getEntity());
        packageConfig.setController(packageName.getController());
        packageConfig.setService(packageName.getService());
        packageConfig.setServiceImpl(packageName.getServiceImpl());
        packageConfig.setMapper(packageName.getMapper());
        packageConfig.setXml(packageName.getXml());

        return packageConfig;
    }

    /**
     * 模板配置
     */
    private TemplateConfig templateConfig() {
        TemplateProperties template = generatorProperties.getTemplate();

        TemplateConfig templateConfig = new TemplateConfig();

        // 配置自定义输出模板
        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
        templateConfig.setController(template.getController());
        templateConfig.setService(template.getService());
        templateConfig.setServiceImpl(template.getServiceImpl());
        templateConfig.setMapper(template.getMapper());
        templateConfig.setXml(template.getXml());
        templateConfig.setEntity(template.getEntity());
        return templateConfig;
    }

    /**
     * 策略配置
     */
    private StrategyConfig strategyConfig() {
        StrategyConfig strategyConfig = new StrategyConfig();
        // 父类相关配置
        SupperClassProperties supperClassProperties = generatorProperties.getSupperClass();
        strategyConfig.setSuperEntityClass(supperClassProperties.getEntity());
        strategyConfig.setSuperServiceClass(supperClassProperties.getService());
        strategyConfig.setSuperServiceImplClass(supperClassProperties.getServiceImpl());
        strategyConfig.setSuperControllerClass(supperClassProperties.getController());
        strategyConfig.setSuperMapperClass(supperClassProperties.getMapper());
        // 生成策略
        StrategyProperties strategyProperties = generatorProperties.getStrategy();
        if (strategyProperties.getTablePrefix() != null) {
            strategyConfig.setTablePrefix(strategyProperties.getTablePrefix());
        }
        if (strategyProperties.getInclude() != null) {
            strategyConfig.setInclude(strategyProperties.getInclude());
        }
        if (strategyProperties.getExclude() != null) {
            strategyConfig.setExclude(strategyProperties.getExclude());
        }
        strategyConfig.setEntityLombokModel(strategyProperties.getLombok());
        strategyConfig.setEntityBooleanColumnRemoveIsPrefix(strategyProperties.getRemoveBooleanColumnIsPrefix());
        // 以下为生成策略默认配置，一般不需要改动
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setEntitySerialVersionUID(true);
        strategyConfig.setEntityColumnConstant(false);
        strategyConfig.setChainModel(false);
        strategyConfig.setRestControllerStyle(false);
        strategyConfig.setControllerMappingHyphenStyle(false);
        strategyConfig.setEntityTableFieldAnnotationEnable(true);
        strategyConfig.setEnableSqlFilter(false);

        return strategyConfig;
    }

    ;
}
