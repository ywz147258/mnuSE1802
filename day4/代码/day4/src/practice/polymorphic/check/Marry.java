package practice.polymorphic.check;

public class Marry extends CheckService{
    @Override
    public void checkLeave(Integer days) {
        if(days>10){
            System.out.println("婚假最多不能超过10天");
        }else{
            System.out.println("婚假审核通过");
        }
    }
}
