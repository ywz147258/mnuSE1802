package homeWork.two;

public class Porsche extends Car{
    public Porsche(String log, String color) {
        super(log, color);
    }
    public Porsche() {
    }
    @Override
    public void move() {
        System.out.println("开保时捷");
    }
}
