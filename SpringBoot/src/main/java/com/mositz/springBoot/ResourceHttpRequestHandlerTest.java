package com.mositz.springBoot;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

/**
 * Created by zhangxingxing on 16/7/4.
 * 添加自己的资源路径
 */
@Component
public class ResourceHttpRequestHandlerTest extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.err.println(registry.addResourceHandler("classpath:/public"));
        super.addResourceHandlers(registry);
    }

}
