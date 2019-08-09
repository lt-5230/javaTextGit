package com.offcn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//######################################################################################
/**
 * @author lt
 * @create 2019-08-05 10:09
 */

//配置类
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/myPic/**").addResourceLocations("file:D:\\0311youlexuan\\myImp\\");
    }
}
