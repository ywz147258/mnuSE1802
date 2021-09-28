package HWatiAndNotify;

public class Main {
    public static void main(String[] args) {
        Food food = new Food();
        Chief chief = new Chief(food);
        chief.setName("厨师小当家");
        Chief chiefB = new Chief(food);
        chiefB.setName("厨师阿邦");

        Consumer consumer = new Consumer(food);
        consumer.setName("顾客亚索");
        Consumer consumerB = new Consumer(food);
        consumerB.setName("顾客安妮");

        chief.start();
        consumer.start();
        chiefB.start();
        consumerB.start();
    }
}
