package BRunnable;

public class Main {
    public static void main(String[] args) {
        RunnableA runnableA = new RunnableA();
        Thread thread = new Thread(runnableA,"线程A");
        thread.start();

    }
}
