package Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ANewCachedThreadPool {
    public static void main(String[] args) {
        ExecutorService es1= Executors.newCachedThreadPool();
        for(int i=1;i<=5;i++){
            final int index=i;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            es1.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("第"+index+"个线程,"+Thread.currentThread().getName());
                }
            });
        }
    }
}
