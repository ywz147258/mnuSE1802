package CCollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people1 = new ArrayList<>();
        people1.add(new Person("游文智",100));
        people1.add(new Person("小明",80));
        people1.add(new Person("大王",120));
        //排序
        Collections.sort(people1);
//        在排序的基础上反排序
        Collections.reverse(people1);
        people1.forEach(i->{
            System.out.println(i);
        });

        List<Person> people2= new ArrayList<>();
        people2.add(new Person("游文智2",100));
        people2.add(new Person("小明2",80));
        people2.add(new Person("大王2",120));
        people2.add(new Person("大王3",120));

        //将people1 复制到 people2，前提是 people2的长度要大于等于people1
        //不好用
        Collections.copy(people2,people1);
        people2.forEach(i->{
            System.out.println(i);
        });
    }

}
