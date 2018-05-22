package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/5/17.
 */
public class SubjectProxy<T> implements InvocationHandler{

    private Class<T> methodInterface;

    public SubjectProxy(Class<T> methodInterface){
        this.methodInterface = methodInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName());
        return null;
    }
}
