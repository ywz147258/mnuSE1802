package polymorphic.inte;

import polymorphic.clas.Pet;

public class Main {
    public static void main(String[] args) {
        PetI dog= new Dog();
        PetI penguin= new Penguin();

        Master master = new Master();
        master.cure(dog);
        master.cure(penguin);
    }
}
