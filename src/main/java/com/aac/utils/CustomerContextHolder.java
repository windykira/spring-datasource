package com.aac.utils;

import org.springframework.util.StringUtils;

/**
 * Created by Administrator on 2018/4/10.
 */
public class CustomerContextHolder {

    public static final String DATA_SOURCE_MASTER = "dataSource";
    public static final String DATA_SOURCE_SLAVE = "slaveDataSource";
    //用ThreadLocal来设置当前线程使用哪个dataSource
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    public static void setCustomerType(String customerType) {
        contextHolder.set(customerType);
    }
    public static String getCustomerType() {
        String dataSource = contextHolder.get();
        if (StringUtils.isEmpty(dataSource)) {
            return DATA_SOURCE_MASTER;
        }else {
            return dataSource;
        }
    }
    public static void clearCustomerType() {
        contextHolder.remove();
    }
}
