package polymorphic.clas;

import polymorphic.inte.PetI;

public class Main {
    public static void main(String[] args) {
        Pet dog= new Dog();
        Pet penguin= new Penguin();

//        Master master = new Master();
//        master.cure(dog);
//        master.cure(penguin);

        Pet pet = new Dog();
        pet.health();//调用子类
        pet.move();//调用的是父类
        System.out.println(pet.name);//调用的父类的成员变量
    }
}
