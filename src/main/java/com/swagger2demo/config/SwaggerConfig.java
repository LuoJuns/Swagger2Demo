package com.swagger2demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Jun
 * @description TODO
 * @Date 2022/12/23 14:05
 * @modify
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig { //启动后进入： localhost:8080(项目端口)/swagger-ui.html 阅读接口文档
    @Bean
    public Docket systemManagerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                //获取接口信息
                .apiInfo(getApiInfo())
                //指定主机域名
                .host("https://www.baidu.com/")
                //分组
                .groupName("systemManager")
                .select()
                //-------- 指定扫描那些接口 --------
                //扫描所有
                //.apis(RequestHandlerSelectors.any())
                //扫描所有有注解的api
                //.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                //扫描指定位置
                .apis(RequestHandlerSelectors.basePackage("com.swagger2demo.controller"))
                //-------- 指定扫描路径 --------
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket systemAppApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                //获取接口信息
                .apiInfo(getApiInfo())
                //分组
                .groupName("systemApp")
                .select()
                //-------- 指定扫描那些接口 --------
                //扫描所有
                //.apis(RequestHandlerSelectors.any())
                //扫描所有有注解的api
                //.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                //扫描指定位置
                .apis(RequestHandlerSelectors.basePackage("com.swagger2demo.controller"))
                //-------- 指定扫描路径 --------
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                //标题
                .title("测试swagger接口文档")
                //描述
                .description("第一次配置swagger在线文档")
                //许可证
                .license("Swagger api 2022/12/23")
                //许可证地址
                .license("https://www.github.com")
                //服务条款地址
                .termsOfServiceUrl("https://www.spring.io")
                //版本
                .version("1.0.0")
                //维护人信息
                .contact(new Contact("LuoJun", "https://github.com/LuoJuns", "lj997747908@163.com"))
                .build();
    }



}
