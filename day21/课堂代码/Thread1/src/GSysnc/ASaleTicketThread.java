package GSysnc;

/**
 * 锁代码块
 */
public class ASaleTicketThread extends Thread {
    static Integer i=50;
    static Object object = new Object();
    @Override
    public void run() {
        boolean isContinue=true;
        while(isContinue){
            synchronized(object){
                if(i>0){
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(this.getName()+"售出第"+i+"张票");
                    i--;
                }else{
                    isContinue=false;
                }
            }
        }
    }
}
