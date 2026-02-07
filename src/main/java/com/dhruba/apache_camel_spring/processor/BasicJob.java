package com.dhruba.apache_camel_spring.processor;

import com.dhruba.apache_camel_spring.route.FirstRoute;
import org.springframework.scheduling.annotation.Scheduled;

public class BasicJob {
    private final FirstRoute firstRoute;

    public BasicJob(FirstRoute firstRoute) {
        this.firstRoute = firstRoute;
    }

    @Scheduled(initialDelay = 1L, fixedRate = 1000)
    public void process () throws Exception {
        System.out.println("sgdg");
        firstRoute.configure();
    }
}
