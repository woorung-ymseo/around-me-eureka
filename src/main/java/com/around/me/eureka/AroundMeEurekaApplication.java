package com.around.me.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AroundMeEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AroundMeEurekaApplication.class, args);
    }

}
