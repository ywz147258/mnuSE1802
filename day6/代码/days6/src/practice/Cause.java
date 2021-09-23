package practice;

public class Cause extends LeaveService{

    public Cause(Integer days) {
        super(days);
    }

    @Override
    public boolean leave() {
        if(getDays()>2){
            return false;
        }else{
            return true;
        }
    }
}
