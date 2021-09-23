package jicheng;

public class Dog extends Pet{

    public String sex="petSex";

    public Dog(){
        System.out.println("狗出生了");
    }

    public Dog(String sex){
        System.out.println("狗子出生了，是"+sex);
    }

    //狗的移动
    @Override
    public void move(){
        super.move();
        System.out.println("狗爬");
    }

    public void sexSelect(){
        //首先会到方法内找变量

        String sex="innerSex";
        //找一个变量叫sex
        System.out.println(sex);
        System.out.println(this.sex);
        System.out.println(super.sex);
    }

}
