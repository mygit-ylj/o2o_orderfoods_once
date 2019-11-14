package com.yanglijing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName ServerApplication
 * @Description: TODO
 * @Author :yanglijing
 * @Date 2019/11/13
 * @Version V1.0
 **/
@EnableEurekaServer
@SpringBootApplication
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}
