package com.springboot.javaee.chapter1.aop;

import java.lang.annotation.*;

/**
 * @Description: aop拦截规则注解
 * @Author: leiyulin
 * @date: 2018/8/23
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
