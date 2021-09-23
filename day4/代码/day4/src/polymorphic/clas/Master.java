package polymorphic.clas;

import polymorphic.inte.PetI;

public class Master {

    /**
     * 看病
     * @param pet
     */
    public void cure(Pet pet){
        pet.health();
    }
}
