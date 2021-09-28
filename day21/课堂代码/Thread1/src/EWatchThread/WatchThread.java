package EWatchThread;

public class WatchThread extends Thread {

    @Override
    public void run() {
        int i=0;
        while(true){
            i++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName()+i);
        }
    }
}
