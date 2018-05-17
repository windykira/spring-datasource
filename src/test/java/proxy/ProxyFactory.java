package proxy;

import com.aac.service.WebUserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2018/5/17.
 */
public class ProxyFactory<T> {

    public static <T> T newInstance(WebUserService subject){
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        SubjectProxy handler = new SubjectProxy(subject);
        return (T)Proxy.newProxyInstance(classLoader,interfaces,handler);
    }
}
