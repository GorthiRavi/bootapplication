package com.boo.bootapplication.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandlineRunnerEx  implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Executing CommandlineRunner");
    }
}