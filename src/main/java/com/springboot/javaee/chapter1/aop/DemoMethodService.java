package com.springboot.javaee.chapter1.aop;

import org.springframework.stereotype.Service;

/**
 * @Description: 使用方法规则被拦截类
 * @Author: leiyulin
 * @date: 2018/8/23
 */
@Service
public class DemoMethodService {
    public void add(){
        System.out.println(DemoMethodService.class.getName() + " add");
    }
}
