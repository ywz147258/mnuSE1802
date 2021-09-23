package polymorphic.inte;

import polymorphic.clas.Pet;

public class Penguin implements PetI {
    @Override
    public void health() {
        System.out.println("给企鹅看病");
    }
}
