package com.springboot.javaee.chapter1.aop;

import org.springframework.stereotype.Service;

/**
 * @Description: 注解的被拦截类
 * @Author: leiyulin
 * @date: 2018/8/23
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add(){}
}
