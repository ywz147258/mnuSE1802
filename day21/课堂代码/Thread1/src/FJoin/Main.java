package FJoin;

public class Main {
    public static void main(String[] args) {
        NormalThread normalThread = new NormalThread();
        normalThread.setName("普通线程");

        JoinThread joinThread = new JoinThread();
        joinThread.setName("大佬线程");
        joinThread.start();
        try {
            joinThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        normalThread.start();
    }
}
