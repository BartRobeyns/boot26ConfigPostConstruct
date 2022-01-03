package com.example.demo;

import static org.springframework.test.util.AssertionErrors.assertEquals;

import com.example.demo.conf.AppConf;
import com.example.demo.conf.ConstructorBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    Integer testBean;

    @Test
    void contextLoads() {
        System.out.println(testBean);
        System.out.println(ConstructorBean.testBeanFromInit);
        assertEquals("Not the same bean as in the init", testBean, ConstructorBean.testBeanFromInit);
    }

}
