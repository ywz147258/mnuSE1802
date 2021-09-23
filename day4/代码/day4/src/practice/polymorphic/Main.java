package practice.polymorphic;

public class Main {
    public static void main(String[] args) {
        //父亲 new出了 一个 儿子
        Leave leave= new Marry();
        Leave cause=new Cause();
        Salary salary = new Salary();
        salary.deductMoney(leave,8);
        salary.deductMoney(cause,10);
    }
}
