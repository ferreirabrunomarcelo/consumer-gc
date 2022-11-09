package com.xaas.consumergc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class ConsumerGoogleAppEngineController {

    private final RestTemplate restTemplate;

    @GetMapping
    public String getMessage() {
        return "The message is: " + restTemplate.getForEntity("https://sound-essence-368117.uc.r.appspot.com/", String.class)
                .getBody();
    }


}
