package BMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class BLinkHashMap {
    public static void main(String[] args) {
        Map<String,Object> maps =new LinkedHashMap<>();
        maps.put("可乐",2);
        maps.put("矿泉水1",3);
        maps.put("矿泉水2",3);
        maps.put("矿泉水3",3);
        maps.put("矿泉水4",3);
        maps.put("矿泉水5",3);
        maps.put("矿泉水6",3);
        maps.put("key",null);

        for(String str:maps.keySet()){
            System.out.println(str);
        }
    }
}
