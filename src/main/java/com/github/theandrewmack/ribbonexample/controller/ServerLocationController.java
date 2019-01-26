package com.github.theandrewmack.ribbonexample.controller;

import com.github.theandrewmack.ribbonexample.client.PingClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerLocationController {

    private PingClient pingClient;

    public ServerLocationController(PingClient pingClient) {
        this.pingClient = pingClient;
    }

    @RequestMapping("/server-location")
    public String getServerLocation() {
        return pingClient.locaus();
    }
}
