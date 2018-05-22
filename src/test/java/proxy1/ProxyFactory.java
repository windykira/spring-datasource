package proxy1;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2018/5/22.
 */
public class ProxyFactory {

    public static <T> T newInstance(Class<T> clazz) throws Exception {
        T t = (T)Class.forName(clazz.getName()).newInstance();
        SubjectProxy subjectProxy = new SubjectProxy(t);
        return (T)Proxy.newProxyInstance(clazz.getClassLoader(),t.getClass().getInterfaces(),subjectProxy);
    }
}
