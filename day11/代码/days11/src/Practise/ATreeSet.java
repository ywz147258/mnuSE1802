package Practise;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ATreeSet {
    public static void main(String[] args) {
            test();
    }
    public static void test(){
        boolean isContinue=true;
        Set<Goods> goodsSet = new TreeSet<>();
        while(isContinue){
            Scanner scanner= new Scanner(System.in);
            System.out.println("请输入商品名称");
            String name=scanner.next();
            System.out.println("请输入商品价格");
            Integer price=scanner.nextInt();
            Goods goods= new Goods(name,price);
            goodsSet.add(goods);
            System.out.println("是否继续，y/n");
            String result=scanner.next();
            if(!result.equals("y")){
                isContinue=false;
            }
        }
        for(Goods goods:goodsSet){
            System.out.println(goods);
        }
    }
}
