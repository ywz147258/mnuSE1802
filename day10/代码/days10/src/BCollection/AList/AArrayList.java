package BCollection.AList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AArrayList {
    public static void main(String[] args) {
        //arrayList 定义 泛型
        ArrayList<Integer> list = new ArrayList<>();
        //添加
        list.add(11);
        list.add(22);

        List<Dog> dogs= new ArrayList<>();
        dogs.add(new Dog("萨摩耶",7));
        dogs.add(new Dog("金毛",10));

        //获取list的长度
        dogs.size();

        //获取 参数为下标，因为list的底层是数组
        dogs.get(0);
        //截取
//        dogs=dogs.subList(0,1);
        //替换
        dogs.set(0,new Dog("哈士奇",11));
        //转数组
        Object[] dogArr=dogs.toArray();
        for(Object dog:dogArr){
            Dog d= (Dog) dog;
            System.out.println("强转:"+d.getName());
        }
        //移除 根据下标
//        dogs.remove(1);

        //遍历
        for(int i=0;i<dogs.size();i++){
            System.out.println(dogs.get(i).getName());
        }

        //增强遍历
        for(Dog dog :dogs){
            System.out.println("增强遍历:"+dog.getName());
        }

//        String name="ywz";
        //foreach
        dogs.forEach(i->{
//            name="www";//无法在foreach内重新对外部的变量进行赋值
            System.out.println("foreach:"+i.getName());
        });

        //while遍历
        Integer i=0;
        while(i<dogs.size()){
            System.out.println(dogs.get(i).getName());
            i++;
        }

        //iterator 遍历
        Iterator<Dog> dogsIt = dogs.iterator();
        while(dogsIt.hasNext()) {
            System.out.println("Iterator:"+dogsIt.next().getName());
        }
    }
}
