package AThread;

public class Main {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        MyThreadB myThreadb = new MyThreadB();
//        myThread.start();
//        myThreadb.start();


//        Main main = new Main();
//        main.printA();
//        main.printB();


        MyThreadC myThreadC = new MyThreadC();
        myThreadC.setName("线程C");
        MyThreadC myThreadC2 = new MyThreadC();
        myThreadC2.setName("线程C2");
        myThreadC.setPriority(10);
        myThreadC2.setPriority(1);

        myThreadC.start();
        myThreadC2.start();




    }

    public  void printA(){
        for(int i=0;i<100;i++){
            System.out.println("线程A："+i);
            if(i==50){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public  void printB(){
        for(int i=0;i<100;i++){
            System.out.println("线程B："+i);
        }
    }
}
