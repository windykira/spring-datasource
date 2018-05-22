package mybatis;

import java.lang.reflect.Proxy;

/**
 * Created by haoz-dev4 on 2018/5/22.
 */
public class MethodProxyFactory<T> {

    private final Class<T> mapperInterface;

    public MethodProxyFactory(Class<T> mapperInterface){
        this.mapperInterface = mapperInterface;
    }

    protected T newInstance() throws IllegalAccessException, InstantiationException {
        MapperProxy<T> mapperProxy = new MapperProxy(mapperInterface);
        return (T)Proxy.newProxyInstance(mapperProxy.getClass().getClassLoader(),new Class[]{mapperInterface},mapperProxy);
    }
}
