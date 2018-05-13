import com.aac.testaspect.TestAspectSerivceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2018/4/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/spring-config.xml")
public class TestAspect {

    @Test
    public void test(){

        TestAspectSerivceImpl.test();
    }
}
