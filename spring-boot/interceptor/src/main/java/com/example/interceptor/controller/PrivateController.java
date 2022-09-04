package com.example.interceptor.controller;

import com.example.interceptor.annotation.Auth;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/private")
@Auth // Auth 가 통과 될 때만 controller 사용
@Slf4j
public class PrivateController {

    @GetMapping("/hello")
    public String hello(){
        log.info("private hello controller");

        return "private hello";
    }


}
