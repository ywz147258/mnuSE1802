package HWatiAndNotify;

import java.util.Random;

public class Chief extends Thread {
    private static Food food;
    public Chief(Food food){
        this.food=food;
    }

    @Override
    public void run() {
        while(true){
            synchronized (food){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //没菜就炒菜
                if(food.flag==false){
                    Integer i =(int)(Math.random()*100)%2;
                    if(i==0){
                        food.setName("牛排");
                        food.setPrice(100);
                    }else{
                        food.setName("撒拉");
                        food.setPrice(100);
                    }
                    food.flag=true;
                    System.out.println(this.getName()+"炒菜,"+food.toString());
                    //炒完菜要通知顾客去吃
                    food.notifyAll();
                }else{
                    //有菜就休息
                    try {
                        food.wait();
                        System.out.println(this.getName()+"休息");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
