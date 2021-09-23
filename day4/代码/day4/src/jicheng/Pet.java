package jicheng;


public class Pet extends Animal{

    public Pet(){
        System.out.println("宠物出生了");
    }

    public String sex="animalSex";

    public void breathe(){
        System.out.println("呼吸");
    }

    //移动
    public void move(){
        System.out.println("移动");
    }

    public void health(String name){
        this.setAge(20);
    }
}
