package HWatiAndNotify;

public class Consumer extends Thread {
    private static Food food;
    public Consumer(Food food){
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
                //有菜就吃
                if(food.flag==true){
                    food.flag=false;
                    System.out.println(this.getName()+"吃了"+food.toString());
                    //通知厨师炒菜
                    food.notifyAll();
                }else{
                    //没菜就不吃
                    try {
                        food.wait();
                        System.out.println(this.getName()+"在等待");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
