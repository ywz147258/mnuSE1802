package practice.polymorphic.check;

public class CheckService {
    public void checkLeave(Integer days){

    }

    public void check(CheckService checkService,Integer days){
        checkService.checkLeave(days);
    }
}
