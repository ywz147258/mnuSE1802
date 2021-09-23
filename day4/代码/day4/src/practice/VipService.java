package practice;

import java.math.BigDecimal;
import java.util.Scanner;

public class VipService {

    public static void main(String[] args) {
        VipService vipService= new VipService();
        vipService.service();
    }

    public void service(){
        System.out.println("欢迎光临理发店");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名");
        String name= scanner.next();
        System.out.println("请输入您的手机号");
        String tel= scanner.next();
        Vip vip = new Vip(name,tel);
        String button="";
        while(!button.equals("s")){
            System.out.println("请问是要充值还是消费，充值d，消费p,结束s");
            button = scanner.next();
            //充值服务
            if(button.equals("d")){
                System.out.println("请输入充值金额");
                BigDecimal money=new BigDecimal(scanner.nextDouble());
                vip.deposit(money);
                vip.accountTip();
            }
            //消费服务
            if(button.equals("p")){
                System.out.println("请输入消费金额");
                BigDecimal money=new BigDecimal(scanner.nextDouble());
                vip.pay(money);
                vip.accountTip();
            }
            if(button.equals("s")){
                System.out.println("请下次再来");
            }
        }
    }
}
