package AThread;

public class MyThread extends Thread {
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("线程A："+i);
            if(i==50){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
