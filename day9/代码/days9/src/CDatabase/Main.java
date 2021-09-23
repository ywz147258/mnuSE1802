package CDatabase;

import CDatabase.service.UserService;
import CDatabase.service.impl.UserServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号和密码");
        String userName=scanner.next();
        String psw=scanner.next();
        UserService userService = new UserServiceImpl();
        userService.login(userName,psw);

    }
}
