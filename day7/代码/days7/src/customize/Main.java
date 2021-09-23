package customize;

public class Main {
    public static void main(String[] args) {
        CashService cashService = new CashService();
        try {
            cashService.cash(-1);
        } catch (CashException e) {
            e.printStackTrace();
        }
    }
}
