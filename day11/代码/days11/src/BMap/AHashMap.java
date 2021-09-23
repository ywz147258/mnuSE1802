package BMap;

import ASet.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AHashMap {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        maps.put("可乐",2);
        maps.put("矿泉水1",3);
        maps.put("矿泉水2",3);
        maps.put("矿泉水3",3);
        maps.put("矿泉水4",3);
        maps.put("矿泉水5",3);
        maps.put("矿泉水6",3);

        //遍历
        Set<String> sets= maps.keySet();
        for(String i:sets){
            System.out.println(i);
//            System.out.println(maps.get(i));
        }

        //map的key通常不会放实体类
        Map<String, Person> personMap=new HashMap<>();
        personMap.put("ywz",new Person("ywz",12));

        //一般是这么用的
        Map<String,Object> objectMap= new HashMap<>();
        objectMap.put("key","value");
    }
}
