package Pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DNewScheduleThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService= Executors.newScheduledThreadPool(3);
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"运行");
            }
        }, 1,2, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"运行");
            }
        }, 1,2, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"运行");
            }
        }, 1,2, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"运行");
            }
        }, 1,2, TimeUnit.SECONDS);
    }
}
