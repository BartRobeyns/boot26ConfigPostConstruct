package com.example.demo.conf;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorBean {
    @Autowired
    Integer testBean;

    public static Integer testBeanFromInit;

    @PostConstruct
    public void init() {
        testBeanFromInit = testBean;
    }

}
