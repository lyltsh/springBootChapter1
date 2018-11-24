package com.springboot.javaee.chapter2.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/8/23
 */
@Service
public class AsyncTaskService {
    //@Async注解，默认使用getAsyncExecutor方法里面的ThreadPool来执行异步任务
    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务:" + Thread.currentThread().getName() + ",i:" + i);
    }

    public void executeAsyncTaskPlus(Integer i) {

        System.out.println("执行异步任务+1：" + Thread.currentThread().getName() + ",i:" + (i + 1));
    }
}
