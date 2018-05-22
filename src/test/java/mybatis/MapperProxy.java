package mybatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by haoz-dev4 on 2018/5/22.
 */
public class MapperProxy<T> implements InvocationHandler{

    private Class<T> methodInterface;

    public MapperProxy(Class<T> methodInterface) {
        this.methodInterface = methodInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法名:" + method.getName());
        return null;
    }
}
