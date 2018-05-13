package com.aac.utils;

import org.aopalliance.aop.Advice;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/4/11.
 */
@Component
@Aspect
public class DataSourceAspect{

    @Before("execution(* com.aac.dao.*.*(..))")
    public void before(JoinPoint point) {
        Object target = point.getTarget();
        //System.out.println(target.toString());
        String method = point.getSignature().getName();
        //System.out.println(method);
        Class<?>[] clazz = target.getClass().getInterfaces();
        Class<?>[] parameterTypes = ((MethodSignature) point.getSignature())
                .getMethod().getParameterTypes();
        try {
            Method m = clazz[0].getMethod(method, parameterTypes);
            //System.out.println(m.getName());
            if (m != null && m.isAnnotationPresent(DataSource.class)) {
                DataSource data = m.getAnnotation(DataSource.class);
                CustomerContextHolder.setCustomerType(data.value());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
