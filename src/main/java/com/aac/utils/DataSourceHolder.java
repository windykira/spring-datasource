package com.aac.utils;

/**
 * Created by Administrator on 2018/4/11.
 */
public class DataSourceHolder {

    private static final ThreadLocal<String> datasourcce = new ThreadLocal<String>();

    public static void setCustomeType(String type){
        datasourcce.set(type);
    }

    public static String getCustomeType(){
        return datasourcce.get();
    }

    public static void remove(){
        datasourcce.remove();
    }
}
