package BCollection.AList;

import java.util.LinkedList;
import java.util.List;

public class BLinkList {
    public static void main(String[] args) {
        LinkedList<Dog> dogs = new LinkedList<>();
        dogs.add(new Dog("吉娃娃",5));
        dogs.add(new Dog("泰迪",6));

        dogs.addFirst(new Dog("法斗",10));
        dogs.addLast(new Dog("藏獒",10));
        dogs.add(3,new Dog("中华田园犬",10));
        dogs.forEach(i->{
            System.out.println(i.getName());
        });


        System.out.println(dogs.getFirst().getName());
        System.out.println(dogs.getLast().getName());

        dogs.removeFirst();
        dogs.removeLast();

    }
}
