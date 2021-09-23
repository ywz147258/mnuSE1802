package polymorphic.clas;

import polymorphic.inte.PetI;

public class Penguin extends Pet{
    @Override
    public void health() {
        System.out.println("给企鹅看病");
    }
}
