package com.xizi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.xizi.dao")
@EnableFeignClients
public class EmpsApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmpsApplication.class,args);
    }

}
