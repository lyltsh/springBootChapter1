package com.springboot.javaee.chapter1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Description: 日志切面
 * @Author: leiyulin
 * @date: 2018/8/23
 */
@Component
@Aspect
public class LogAspect {
    @Pointcut("@annotation(com.springboot.javaee.chapter1.aop.Action)")
    public void annotationPointCut() {
    }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截 " + action.name());
    }

    @Around("execution(* com.springboot.javaee.chapter1.aop.DemoMethodService.*(..))")
    public void before(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        joinPoint.proceed();
        System.out.println("方法规则式拦截，" + method.getName());
    }
}
