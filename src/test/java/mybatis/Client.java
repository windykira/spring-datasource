package mybatis;

/**
 * Created by haoz-dev4 on 2018/5/22.
 */
public class Client {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        MethodProxyFactory<UserMapper> mapperProxyFactory = new MethodProxyFactory(UserMapper.class);
        UserMapper userMapperProxy = mapperProxyFactory.newInstance();
        userMapperProxy.speak();
        System.out.println(userMapperProxy instanceof UserMapper);
    }
}
