package deadlock;

/**
 * Created by Administrator on 2018/5/14.
 */
public class DeadThread implements Runnable{

    private Object lock1 = new Object();
    private Object lock2 = new Object();
    private String flag;

    public DeadThread(String flag){
        this.flag = flag;
    }

    public void run() {

        synchronized (lock1){
            System.out.println(Thread.currentThread().getName());
        }
        synchronized (lock2){
            System.out.println("lock1-->lock2");
        }
    }
}
