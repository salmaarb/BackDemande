package com.example.demandeeeee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@ComponentScan("com.example.demandeeeee.proxy")
public class DemandeeeeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemandeeeeeApplication.class, args);
    }

}
