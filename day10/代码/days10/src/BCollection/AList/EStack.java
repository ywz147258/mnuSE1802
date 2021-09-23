package BCollection.AList;

import java.util.List;
import java.util.Stack;

public class EStack {
    public static void main(String[] args) {
        Stack<Dog> dogs =new Stack<>();
        dogs.push(new Dog("狗1",10));
        dogs.push(new Dog("狗2",10));
        dogs.push(new Dog("狗3",10));

        while(dogs.size()>0){
            System.out.println(dogs.pop().getName());
        }
    }
}
