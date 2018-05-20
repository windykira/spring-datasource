package thread;

/**
 * Created by Administrator on 2018/5/20.
 */
public class ThreadB extends Thread{

    private Object lock;

    public ThreadB(Object lock){
        this.lock = lock;
    }

    public void run(){
        try {
            synchronized (lock){
                for(int i=0;i<10;i++){
                    MyList.add();
                    if(MyList.getSize() == 5){
                        lock.notify();
                        System.out.println("已发出通知。。。");
                    }
                    System.out.println("添加了"+(i+1)+"个元素。");
                    Thread.sleep(1000);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
