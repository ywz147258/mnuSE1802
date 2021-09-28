package DStopThead;

public class BStopThreadInterrupt extends Thread {

    public boolean isContinue=true;
    @Override
    public void run() {
        int sum =0;
        while(isContinue){
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+sum++);
            } catch (InterruptedException e) {
                e.printStackTrace();
                isContinue=false;
            }
        }
    }
}
