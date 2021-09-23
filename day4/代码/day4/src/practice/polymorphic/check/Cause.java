package practice.polymorphic.check;

public class Cause extends CheckService{
    @Override
    public void checkLeave(Integer days) {
       if(days>2){
           System.out.println("事假最多不能超过2天");
       }else {
           System.out.println("事假审核通过");
       }
    }
}
