package com.github.theandrewmack.ribbonexample.client;

import com.github.theandrewmack.ribbonexample.config.RibbonConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.client.RestTemplate;

@RibbonClient(name = "ping-a-client", configuration = RibbonConfig.class)
public class PingClient {

    private RestTemplate restTemplate;

    public PingClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String locaus() {
        return restTemplate.getForObject("http://ping-client/locaus", String.class);
    }
}
