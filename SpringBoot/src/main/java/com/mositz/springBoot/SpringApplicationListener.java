package com.mositz.springBoot;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by zhangxingxing on 16/7/4.
 */
public class SpringApplicationListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.err.println(event);
    }

}
