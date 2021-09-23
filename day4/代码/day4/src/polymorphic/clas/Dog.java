package polymorphic.clas;

import polymorphic.inte.PetI;

public class Dog  extends Pet{

    public String name="狗";

    public static void move(){
        System.out.println("狗爬");
    }

    @Override
    public void health() {
        System.out.println("给狗看病");
    }
}
