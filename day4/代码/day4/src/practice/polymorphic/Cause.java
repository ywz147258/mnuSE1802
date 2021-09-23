package practice.polymorphic;

/**
 * 事假
 */
public class Cause extends Leave{
    @Override
    public void deductMoney(Integer days) {
        System.out.println("事假每天都扣钱");
    }
}
