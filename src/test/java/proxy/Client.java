package proxy;

import com.aac.service.WebUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2018/5/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/spring-config.xml")
public class Client {

    @Autowired
    WebUserService webUserService;

    @Test
    public void test() throws InstantiationException, IllegalAccessException {

        WebUserService subWebUserService = ProxyFactory.newInstance(WebUserService.class);
        subWebUserService.listUsers();
        assert subWebUserService !=  null;
    }

    public static void main(String[] args){

        Subject realSubject = new RealSubject();
        //SubjectProxy subjectProxy = new SubjectProxy(realSubject);
        /*Subject proxySubject = ProxyFactory.newInstance(realSubject);
        proxySubject.speak();
        proxySubject.walk();*/

    }
}
