package com.boo.bootapplication.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SampleScheduler {

    @Scheduled(cron = "0 * 10 * * ?")
    public void cornMethod(){
        System.out.println("Corn Expreesion Excuted at 10PM every Day");
    }

    @Scheduled(fixedRate = 100000)
    public void fixedRate(){
        System.out.println("Fixed Rate Excuted at every 10Min");
    }

    @Scheduled(fixedDelay = 100000, initialDelay = 3000)
    public void intialDelayMeyhod(){
        System.out.println("Intial Delay method Excuted at every 10Min after starting 3 sec of srever ");
    }
}
