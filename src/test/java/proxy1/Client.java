package proxy1;

/**
 * Created by Administrator on 2018/5/22.
 */
public class Client {

    public static void main(String[] args) throws Exception {

        TestService testServiceImpl = new TestServiceImpl();
        TestService proxyTestServiceImpl = ProxyFactory.newInstance(testServiceImpl.getClass());
        proxyTestServiceImpl.speak();
    }
}
