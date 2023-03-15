package com.lagou.config;

import com.lagou.pojo.AnotherComponent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyService {


    @ConfigurationProperties(prefix = "another")
    @Bean
    public AnotherComponent anotherComponent(){
        return new AnotherComponent();
    }


}
