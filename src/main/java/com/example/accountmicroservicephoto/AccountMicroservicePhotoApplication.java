package com.example.accountmicroservicephoto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountMicroservicePhotoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountMicroservicePhotoApplication.class, args);
    }

}
