package com.springboot.javaee.chapter2.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Description:
 * EnableScheduling注解，开启对计划任务的支持
 * @Author: leiyulin
 * @date: 2018/8/23
 */
@Configuration
@ComponentScan("com.springboot.javaee.chapter2.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
