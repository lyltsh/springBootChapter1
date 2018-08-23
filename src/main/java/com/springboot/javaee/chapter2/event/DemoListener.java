package com.springboot.javaee.chapter2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * 1、实现ApplicationListener接口，并制定监听的事件类型
 * 2、使用onApplicationEvent方法对消息进行接受处理
 * @Author: leiyulin
 * @date: 2018/8/23
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println(DemoListener.class.getName() + " receive message: " + msg);
    }
}
