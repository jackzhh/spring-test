package com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 01069105 on 2017/11/2.
 */
public class HelloApiTest {
    @Test
    public void sayHello() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/hello.xml");
        HelloApi helloApi = context.getBean("hello", HelloApi.class);
        helloApi.sayHello();
    }

}