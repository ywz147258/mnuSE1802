package BMap;


import java.util.Map;
import java.util.TreeMap;

public class ETreeMap {
    public static void main(String[] args) {
        Map<Person, String > map =new TreeMap<>();
//        map.put("key1",new Person("游文智",100));
//        map.put("key2",new Person("游文智1",80));
//        map.put("key3",new Person("游文智2",70));
//        map.put("key4",new Person("游文智3",120));

        map.put(new Person("游文智1",100),"key1");
        map.put(new Person("游文智2",80),"key2");
        map.put(new Person("游文智3",70),"key3");
        map.put(new Person("游文智4",120),"key4");

        for(Person str:map.keySet()){
            System.out.println(map.get(str));
        }
    }
}
