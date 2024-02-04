package com.example.accountmicroservicephoto.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/account")
public class Controller {

    @GetMapping("/status/check")
    public String status(){
        return "Working...";
    }

}
