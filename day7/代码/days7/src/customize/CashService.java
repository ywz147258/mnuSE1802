package customize;

public class CashService {

    private String name;


    public void cash(Integer money) throws CashException {
        if(money<0){
            throw  new CashException("金额不能小于0");
        }
    }
}
