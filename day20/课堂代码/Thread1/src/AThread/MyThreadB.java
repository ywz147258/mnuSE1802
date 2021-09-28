package AThread;

public class MyThreadB extends Thread {
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("线程B："+i);
        }
    }
}