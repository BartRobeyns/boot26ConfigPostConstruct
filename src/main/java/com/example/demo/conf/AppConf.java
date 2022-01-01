package com.example.demo.conf;

import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConf {

    @Bean
    public String getTestBean() {
        return "";
    }
    @PostConstruct
    public void init() {
        getTestBean();
    }
}
