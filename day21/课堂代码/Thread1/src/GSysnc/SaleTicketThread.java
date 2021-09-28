package GSysnc;

public class SaleTicketThread extends Thread {
    public static Integer i=new Integer(50);

    @Override
    public void run() {
        boolean isContinue=true;
        while(isContinue){
            synchronized(i){
                if(i>0){
                    try {
                        Thread.sleep(10);
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
