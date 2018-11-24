package com.springboot.javaee.chapter3.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/11/247:30 PM
 */
@Configuration
@ComponentScan("com.springboot.javaee.chapter3.condition")
public class ConditionConfig {
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService WindowsService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(MacCondition.class)
    public ListService MacService() {
        return new MacListService();
    }
}
