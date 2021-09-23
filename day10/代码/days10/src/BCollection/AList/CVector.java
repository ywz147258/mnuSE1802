package BCollection.AList;

import java.util.Enumeration;
import java.util.Vector;

public class CVector {
    public static void main(String[] args) {
        Vector<Dog> dogs= new Vector<>();
        dogs.addElement(new Dog("大狗",10));
        dogs.addElement(new Dog("二狗",10));
        dogs.addElement(new Dog("三狗",10));
        dogs.add(new Dog("四狗",10));
        Enumeration<Dog> dogE=dogs.elements();
        while(dogE.hasMoreElements()){
            System.out.println(dogE.nextElement().getName());
        }
     }
}
