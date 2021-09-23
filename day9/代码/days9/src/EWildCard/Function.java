package EWildCard;

import java.util.List;
import java.util.Set;

public class Function {

    public void prints(List<Pet> list){
        for (Pet p:list){
            p.eat();
        }
    }

    public void prints2(List<? extends Pet> list){
        for (Pet p:list){
            p.eat();
        }
    }

    public void prints3(Set<Dog> sets){
        for(Dog dog:sets){
            dog.eat();
        }
    }

    public void prints4(Set<? super Dog> sets){
        sets.forEach(i->{
            Dog dog = (Dog) i;
            dog.eat();
        });
    }


}
