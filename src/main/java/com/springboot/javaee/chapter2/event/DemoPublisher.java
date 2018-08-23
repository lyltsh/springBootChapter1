package com.springboot.javaee.chapter2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Description: 消息发布者
 * 1、注入ApplicationContext用来发布事件
 * 2、使用ApplicationContext的publishEvent方法来发布。
 * @Author: leiyulin
 * @date: 2018/8/23
 */
@Component
public class DemoPublisher
//        implements ApplicationEventPublisherAware{
{
    @Autowired
    ApplicationContext applicationContext;


    public void publish(String msg) {
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }

//    private String msg;
//    @Override
//    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
//        applicationEventPublisher.publishEvent(new DemoEvent(this, msg));
//    }


}
