package homeWork.two;

public abstract class Car {
    private String log;
    private String color;

    public Car(String log, String color) {
        this.log = log;
        this.color = color;
    }
    public Car() {
    }

    public abstract void move();
}
