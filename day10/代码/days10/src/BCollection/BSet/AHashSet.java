package BCollection.BSet;


import java.util.HashSet;

public class AHashSet {
    public static void main(String[] args) {
        HashSet<Person> persons= new HashSet();
        persons.add(new Person("游文智",100));
        persons.add(new Person("周杰伦",60));
        persons.add(new Person("游文智",100));

        //无序打印
        for(Person person:persons){
            System.out.println(person.getName());
        }

//        persons.forEach(i->{
//            System.out.println(i.getName());
//        });
//
//        HashSet<Dog> dogs= new HashSet<>();
//        dogs.add(new Dog("哈士奇"));
//        dogs.add(new Dog("哈士奇"));
//        dogs.forEach(i->{
//            System.out.println(i.getName());
//        });
//
//        HashSet<String> hi= new HashSet<>();
//        hi.add("129");
//        hi.add("129");
//        hi.forEach(i->{
//            System.out.println(i);
//        });
    }
}
