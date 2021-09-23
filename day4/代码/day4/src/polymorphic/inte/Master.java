package polymorphic.inte;

import polymorphic.clas.Pet;

public class Master {

    /**
     * 看病
     * @param pet
     */
    public void cure(PetI pet){
        pet.health();
    }
}
