package ALink;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //底层是链
        LinkTest linkTest =new LinkTest();
        //添加
        linkTest.add(6,1990);
        linkTest.add(5,1991);
        linkTest.add(9,2001);
        linkTest.add(7,2002);
        linkTest.add(3,2003);
        //插入
        linkTest.insertBefore(new Node(666,2004),2);
        //打印
        linkTest.log();
        System.out.println("-----------");
        //移除
        linkTest.remove(3);
        linkTest.removeByIndex(2);
        linkTest.log();

        //底层使用数组
        List lists = new ArrayList();
        lists.add(11);
        lists.add(22);
//        lists.contains()
//        lists.subList()

        System.out.println(lists.get(1));

        for(Object list:lists){
            System.out.println(list);
        }

    }
}
