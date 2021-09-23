package homeWork.two;

public class Bmw extends Car{
    public Bmw(String log, String color) {
        super(log, color);
    }

    public Bmw() {
        
    }

    @Override
    public void move() {
        System.out.println("开宝马");
    }
}
