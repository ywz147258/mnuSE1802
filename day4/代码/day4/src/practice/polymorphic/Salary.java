package practice.polymorphic;

/**
 * 工资
 */
public class Salary {
    public void deductMoney(Leave leave,Integer days){
        leave.deductMoney(days);
    }
}
