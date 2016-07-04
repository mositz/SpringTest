package com.mositz.springBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by zhangxingxing on 16/7/4.
 */

/**
 * 获取命令行启动参数
 */
@Component
public class CommandLineRunnerTest implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.err.println(args);
    }
}
