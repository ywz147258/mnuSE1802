package Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CNewSingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService es1= Executors.newSingleThreadExecutor();
        for(int i=1;i<=10;i++){
            final int index=i;
            es1.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("第"+index+"个线程,,"+Thread.currentThread().getName());
                }
            });
        }
    }
}
