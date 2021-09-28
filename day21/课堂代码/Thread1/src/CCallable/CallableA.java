package CCallable;

import java.util.concurrent.Callable;

public class CallableA implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Integer sum =0;
        for(int i=0;i<100;i++){
            sum+=1;
        }
        return sum;
    }
}
