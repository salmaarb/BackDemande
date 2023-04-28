package com.example.demandeeeee.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="microservice-user", url="http://localhost:8081")

public interface MicroserviceUserProxy {

    @GetMapping ("/api/auth/userr")
    long getUserId();

}
