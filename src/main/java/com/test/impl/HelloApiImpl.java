package com.test.impl;

import com.test.HelloApi;

/**
 * Created by 01069105 on 2017/11/2.
 */
public class HelloApiImpl implements HelloApi {
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
