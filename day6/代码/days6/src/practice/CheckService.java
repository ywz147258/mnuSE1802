package practice;

public class CheckService {
    public void check(LeaveService leaveService){
        boolean result=leaveService.leave();
        String resultMessage=result==true?"通过":"不通过";
        System.out.println(resultMessage);
    }
}
