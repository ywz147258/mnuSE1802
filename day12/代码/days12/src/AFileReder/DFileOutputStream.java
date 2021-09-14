package AFileReder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;

public class DFileOutputStream {
//    //字符
//    char ch = 'a';
//    //字符数组
//    char[] chs= {};
//    //字符串
//    String str="ywz";
//    //字节
//    byte b=127;
    public static void main(String[] args) throws Exception{
//        FileWriter fw= new FileWriter(new File())
        FileOutputStream fo = new FileOutputStream(new File("F:\\闽南师范大学\\day12\\练习\\水浒传.txt"));
        fo.write("滚滚长江东逝水".getBytes());
        fo.flush();
        fo.close();
    }
}
