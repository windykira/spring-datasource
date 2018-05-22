package proxy1;

/**
 * Created by Administrator on 2018/5/22.
 */
public class TestServiceImpl implements TestService{

    @Override
    public void speak() {
        System.out.println("speak...");
    }

    @Override
    public void walk() {
        System.out.println("walk...");
    }
}
