package proxy;

/**
 * Created by Administrator on 2018/5/17.
 */
public class RealSubject implements Subject{
    @Override
    public void speak() {
        System.out.println("speak...");
    }

    @Override
    public void walk() {
        System.out.println("walk...");
    }
}
