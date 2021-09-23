package practice.polymorphic;

/**
 * 婚假
 */
public class Marry extends Leave{
    @Override
    public void deductMoney(Integer days) {
//        super.deductMoney();
        if(days>7){
            System.out.println("婚假超过七天要扣钱");
        }else{
            System.out.println("婚假七天内不扣钱");
        }
    }
}
