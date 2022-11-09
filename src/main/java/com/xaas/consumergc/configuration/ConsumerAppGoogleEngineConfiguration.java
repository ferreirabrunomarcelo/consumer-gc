package com.xaas.consumergc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConsumerAppGoogleEngineConfiguration {

    @Bean
    public RestTemplate getResTempalte() {
        return new RestTemplate();
    }
}
