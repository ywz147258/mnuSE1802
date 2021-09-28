package DStopThead;

public class Main {
    public static void main(String[] args) {
//        AStopThread aStopThread = new AStopThread();
////        aStopThread.start();
////        try {
////            Thread.sleep(2000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
////        aStopThread.stopContinue();


        BStopThreadInterrupt bStopThreadInterrupt = new BStopThreadInterrupt();
        bStopThreadInterrupt.setName("线程A");
        bStopThreadInterrupt.start();
        //通过抛异常的方式来终止线程
        bStopThreadInterrupt.interrupt();
    }
}
