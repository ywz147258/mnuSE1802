package homeWork.two;

public class Benz extends Car{
    public Benz(String log, String color) {
        super(log, color);
    }

    public Benz() {
    }

    @Override
    public void move() {
        System.out.println("坐奔驰");
    }
}
