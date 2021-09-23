package practice.polymorphic.check;

public class Main {
    public static void main(String[] args) {
        CheckService cause= new Cause();
        CheckService marry=new Marry();

        CheckService checkService = new CheckService();
        checkService.check(cause,3);
        checkService.check(marry,4);
    }
}
