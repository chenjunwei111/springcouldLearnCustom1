package com.example.springcouldcus1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



//  启动类
@EnableEurekaClient

@SpringBootApplication
public class Springcouldcus1Application {

    public static void main(String[] args) {
        SpringApplication.run(Springcouldcus1Application.class, args);
    }

}
