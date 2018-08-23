package com.springboot.javaee.chapter2.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: 计划任务执行器
 * @Author: leiyulin
 * @date: 2018/8/23
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔5秒执行一次 " + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 46 20 ? * *")
    //每天的11点28分执行
    public void fixTimeExecution(){
        System.out.println("在指定时间 " + dateFormat.format(new Date()) + "执行");
    }
}
