package jicheng;

public class Bird extends Pet{

    public void health(){
        this.setAge(5);
    }

    public void move(){
        System.out.println("鸟飞");
    }
}
