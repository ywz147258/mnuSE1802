package GSysnc;

public class Caculator extends Thread {
    static long start= System.currentTimeMillis();
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100);
                System.out.println(System.currentTimeMillis()-start);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
