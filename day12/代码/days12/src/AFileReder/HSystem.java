package AFileReder;

import java.io.*;
import java.util.Scanner;

public class HSystem {
    public static void main(String[] args) throws Exception {
        //scanner就是封装了字节流
//        Scanner scanner = new Scanner(System.in);

        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入");
        String result=br.readLine();
        System.out.println(result);
        br.close();

//        BufferedWriter bw1= new BufferedWriter(new FileWriter("e:\\1.txt"));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("hello");
        bw.newLine();
        bw.write("world");
        bw.close();;

    }
}
