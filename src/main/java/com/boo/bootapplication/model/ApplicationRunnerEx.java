package com.boo.bootapplication.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerEx  implements ApplicationRunner {

    @Value("${application.name:BootApplication}")
    String appName;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Executing ApplicationRunner"+appName);
    }
}