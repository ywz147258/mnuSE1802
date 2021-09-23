package homeWork.one;

public class Cat extends Pet{
    public Cat(String food) {
        super(food);
    }

    @Override
    public void eat() {
        System.out.println("猫吃"+getFood());
    }
}
