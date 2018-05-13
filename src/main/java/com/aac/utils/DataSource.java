package com.aac.utils;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2018/4/11.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DataSource {

    public String value() default "dataSource";
}
