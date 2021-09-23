package polymorphic.inte;

import polymorphic.clas.Pet;

public class Dog implements PetI {

    @Override
    public void health() {
        System.out.println("给狗看病");
    }
}
