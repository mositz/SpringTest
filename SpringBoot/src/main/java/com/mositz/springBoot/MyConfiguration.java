package com.mositz.springBoot;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by zhangxingxing on 16/7/4.
 * spring 消息转换
 *
 * 设置web初始化绑定
 */
@Configuration
@CrossOrigin
public class MyConfiguration {

//    @Bean
//    public HttpMessageConverters customConverters() {
//        HttpMessageConverter<?> additional = ...
//        HttpMessageConverter<?> another = ...
//        return new HttpMessageConverters(additional, another);
//    }

    /**
     * web初始化
     * @return
     */
    @Bean
    public ConfigurableWebBindingInitializer custerConfig(){
        ConfigurableWebBindingInitializer configurableWebBindingInitializer = new ConfigurableWebBindingInitializer();
        return configurableWebBindingInitializer;
    }

    /**
     * 错误页面
     * @return
     */
    @Bean
    public BasicErrorControllerTest errController(){
        BasicErrorControllerTest errorControllerTest = new BasicErrorControllerTest(
                new DefaultErrorAttributes(),new ErrorProperties());
        return errorControllerTest;
    }


    /**
     * 注册跨域的配置
     * @return
     */
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**");
            }
        };
    }

//    public ServletRegistrationBean getServletBean(){
//
//    }


//    public FilterRegistrationBean getServletBean(){
//
//    }

    //    public ServletListenerRegistrationBean getServletBean(){
//
//    }


    //    public ServletContextInitializer getServletBean(){
//
//    }

    //    public WebApplicationInitializer getServletBean(){
//
//    }

}
