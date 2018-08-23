package com.springboot.javaee.chapter1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description: aop配置类
 * @Author: leiyulin
 * @date: 2018/8/23
 */
@Configuration
@ComponentScan("com.springboot.javaee.chapter1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
