package thread;

/**
 * Created by Administrator on 2018/5/20.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();
        /*
        ThreadA threadA = new ThreadA(lock);
        threadA.start();
        Thread.sleep(50);*/

        ThreadB Threadb = new ThreadB(lock);
        Threadb.start();
        //Thread.sleep(50);
        ThreadB Threadc = new ThreadB(lock);
        Threadc.start();
    }
}
