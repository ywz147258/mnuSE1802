package BMap;

import java.util.Hashtable;
import java.util.Map;

public class CHashTable {
    public static void main(String[] args) {
        Map<String,Object> maps = new Hashtable<>();
        maps.put("可乐",2);
        maps.put("矿泉水1",3);
        maps.put("矿泉水2",3);
        maps.put("矿泉水3",3);
        maps.put("矿泉水4",3);
        maps.put("矿泉水5",3);
        maps.put("矿泉水6",3);
        //不允许keyvalue为空
//        map.put("key2",null);

        for(String str:maps.keySet()){
            System.out.println(str);
        }

    }
}
