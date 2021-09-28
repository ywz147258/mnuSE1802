package CCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {
        CallableA callableA = new CallableA();
        FutureTask<Integer> result = new FutureTask<Integer>(callableA);
        Thread thread = new Thread(result);
        thread.start();

        try {
            Integer sum=result.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
