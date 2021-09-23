package ASet;

import java.util.Set;
import java.util.TreeSet;

public class ATreeSet {
    public static void main(String[] args) {
        Set<Person> personSet= new TreeSet<>();
        personSet.add(new Person("游文智",100));
        personSet.add(new Person("游文智",100));
        personSet.add(new Person("fmx",100));
        personSet.add(new Person("zjl",150));
        for(Person person:personSet){
            System.out.println(person.getName());
        }
    }


}
