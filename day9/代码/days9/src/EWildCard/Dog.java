package EWildCard;

public class Dog extends Pet implements Comparable<Dog>{
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    @Override
    public int compareTo(Dog o) {
        return 0;
    }
}
