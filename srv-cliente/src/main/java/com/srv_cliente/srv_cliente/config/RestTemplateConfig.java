package com.srv_cliente.srv_cliente.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced  // Se estiver usando Eureka
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
