package customize;

public class CashException extends Exception{
    public CashException(String message) {
        super(message);
        System.out.println("做一些单独的业务逻辑处理");
        System.out.println("该异常进行数据库的存储");
    }
}
