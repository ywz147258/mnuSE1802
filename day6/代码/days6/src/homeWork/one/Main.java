package homeWork.one;

public class Main {
    public static void main(String[] args) {
        Pet dog= new Dog("肉");
        Pet cat =new Cat("鱼");
        Master master= new Master();
        master.feed(dog);
        master.feed(cat);
    }
}
