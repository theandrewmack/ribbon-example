package com.github.theandrewmack.ribbonexample.pingserver2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @RequestMapping("/locaus")
    public String locaus() {
        return "2";
    }
}
