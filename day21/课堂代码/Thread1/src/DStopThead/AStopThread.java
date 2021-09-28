package DStopThead;

public class AStopThread extends  Thread{

    //通过变量来停止多线程
    private boolean isContinue=true;

    public void stopContinue(){
        isContinue=false;
    }

    @Override
    public void run() {
        int sum=1;
        while(isContinue){
            System.out.println("一直打印"+sum++);
        }
    }
}
