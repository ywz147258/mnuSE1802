package EWatchThread;

public class Main {
    public static void main(String[] args) {
        System.out.println("main主线程开始");
        NormalThread thread = new NormalThread();
        thread.setName("子线程A");
        thread.start();

        WatchThread watchThread = new WatchThread();
        watchThread.setName("守护线程");
        watchThread.setDaemon(true);
        watchThread.start();

        System.out.println("main主线程结束");
    }
}
