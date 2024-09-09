package com.template.springproject.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Configuration
public class RestTemplateConfiguration {

//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder builder, LoggingInterceptor loggingInterceptor) {
//    return builder
//        .additionalInterceptors(loggingInterceptor)
//        .additionalMessageConverters(new MappingJackson2HttpMessageConverter())
//        .build();
//    }

    @Bean
    public RestTemplate restTemplate(LoggingInterceptor loggingInterceptor) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setInterceptors(Arrays.asList(loggingInterceptor));
        return restTemplate;
    }
}
