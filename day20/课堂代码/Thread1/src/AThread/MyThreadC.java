package AThread;

public class MyThreadC extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(this.getName()+":"+i);
        }
    }
}
