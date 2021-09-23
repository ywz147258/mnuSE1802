package practice;

public class Main {
    public static void main(String[] args) {
        LeaveService cause= new Cause(7);
        CheckService checkService = new CheckService();
        checkService.check(cause);
    }
}
