package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/5/17.
 */
public class SubjectProxy implements InvocationHandler{

    private Object target;

    public SubjectProxy(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy....");
        return method.invoke(target,args);
    }
}
