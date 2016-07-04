package com.mositz.springBoot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangxingxing on 16/7/1.
 */
@Configuration
@EnableAutoConfiguration
@RestController
@ComponentScan
@ServletComponentScan
public class Example {

    @RequestMapping("/")
    String home() {

        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        //SpringApplication.run(com.mositz.springBoot.Example.class, args);
        SpringApplication app = new SpringApplication(Example.class);
        app.setBannerMode(Banner.Mode.OFF);

        //app.setAddCommandLineProperties(false); 禁用命令行参数

        app.run(args);
    }

}
