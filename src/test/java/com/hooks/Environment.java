package com.hooks;

import lombok.Getter; 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

    @Getter
    @PropertySource("classpath:config.properties")
    @Configuration
    public class Environment {

        @Value("${host}")
        private String host;

        @Value("${timeout}")
        private Long timeout;

    }
