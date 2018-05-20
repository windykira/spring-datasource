package thread;

/**
 * Created by Administrator on 2018/5/20.
 */
public class ThreadA extends Thread{

    private Object lock;

    public ThreadA(Object lock){
        this.lock = lock;
    }

    public void run(){
        try {
            synchronized (lock){
                if(MyList.getSize() != 5){

                    System.out.println("wait begin...");
                    lock.wait();
                    System.out.println("wait end...");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
