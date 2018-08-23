package com.springboot.javaee.chapter2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/8/23
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
