package exceptionP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("请输入账号密码");
//        String userName=scanner.next();
//        String psw= scanner.next();
        LoginService loginService= new LoginService();
//        try{
//            loginService.login(userName,psw);
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            System.out.println("finally");
//        }
        System.out.println(loginService.math(1));


    }
}
