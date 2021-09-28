package GSysnc;

/**
 * 锁方法
 * 如果是继承thread，要把加锁的方法变成静态的
 * 因为每个线程都是一个新对象
 */
public class BSaleTicketThreadB extends Thread {
    static Integer i=50;
    @Override
    public void run() {
        test();
    }
    private synchronized static void test(){
        boolean isContinue=true;
        while(isContinue){
            if(i>0){
                try {
                    Thread.sleep(40);
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
