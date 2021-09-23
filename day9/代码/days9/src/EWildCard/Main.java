package EWildCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<Pet> pets= new ArrayList<>();
        pets.add(new Dog());
        pets.add(new Dog());
        pets.add(new Dog());
        Function function = new Function();
//        function.prints(pets);

        List<Dog> dogs= new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
//        function.prints2(dogs);

        Set<Dog> setDogs= new TreeSet<>();
        setDogs.add(new Dog());
        setDogs.add(new Dog());
        setDogs.add(new Dog());
//        function.prints3(setDogs);

        Set<Pet> setPets= new TreeSet<>();
        setPets.add(new Dog());
        setPets.add(new Dog());
        setPets.add(new Dog());

        function.prints4(setPets);

    }
}
