package practice;

public abstract class LeaveService{
    private Integer days;

    public LeaveService(Integer days){
        this.days=days;
    }

    public Integer getDays(){
        return days;
    }

    public abstract boolean leave();
}
