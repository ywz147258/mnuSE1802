package homeWork.one;

public class Dog extends Pet{
    public Dog(String food) {
        super(food);
    }

    @Override
    public void eat() {
        System.out.println("狗吃"+getFood());
    }
}
