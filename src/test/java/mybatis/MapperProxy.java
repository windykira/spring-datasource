package mybatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by haoz-dev4 on 2018/5/22.
 */
public class MapperProxy<T> implements InvocationHandler{

    private T t;

    public MapperProxy(T t){
        this.t = t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(t,args);
    }
}
