package AFileReder;

import java.io.*;
import java.util.Scanner;

public class HSystem {
    public static void main(String[] args) throws Exception {
        //scanner就是封装了字节流
//        Scanner scanner = new Scanner(System.in);
//        BufferedReader br= new BufferedReader(new FileReader(new File("e:\\1.txt")));
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        FileReader fr= new FileReader(new File("e:\\1.txt"));
        fr.read();

        System.out.println("请输入");
        String result=br.readLine();
        System.out.println(result);
        br.close();

        //这两个都是输出到某个地方
//        BufferedWriter bw1= new BufferedWriter(new FileWriter("e:\\1.txt"));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("hello");
        bw.newLine();
        bw.write("world");
        bw.close();;

    }
}
