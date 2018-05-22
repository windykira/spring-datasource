package proxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/5/22.
 */
public class SubjectProxy<T> implements InvocationHandler{

    private T t;

    public SubjectProxy(T t){
        this.t = t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(t,args);
    }
}
