package FJoin;

public class JoinThread extends Thread {
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            try {
                Thread.sleep(50);
                System.out.println(Thread.currentThread().getName()+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
