package proxy;

import com.aac.service.WebUserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2018/5/17.
 */
public class ProxyFactory {

    public static <T> T newInstance(Class<T> clazz){
        ClassLoader classLoader = clazz.getClassLoader();
        SubjectProxy<T> handler = new SubjectProxy(clazz);
        return (T)Proxy.newProxyInstance(classLoader,new Class[]{clazz},handler);
    }
}
