package GSysnc;

/**
 *  实现了Runnable接口，加锁方法不用加static
 *  因为从头到尾都只有一个对象
 */
public class CSaleTicketRunnable implements Runnable {
    static Integer i=50;
    @Override
    public void run() {
        test();
    }
    private synchronized void test(){
        boolean isContinue=true;
        while(isContinue){
            if(i>0){
                try {
                    Thread.sleep(60);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"售出第"+i+"张票");
                i--;
            }else{
                isContinue=false;
            }
        }
    }
}
