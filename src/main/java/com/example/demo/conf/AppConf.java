package com.example.demo.conf;

import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration()
public class AppConf {

    private static Integer counter = 0;

    @Bean
    public Integer getTestBean() {
        return ++counter;
    }

}
