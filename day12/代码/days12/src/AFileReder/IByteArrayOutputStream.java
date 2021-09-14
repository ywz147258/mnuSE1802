package AFileReder;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class IByteArrayOutputStream {
    public static void main(String[] args) throws Exception{
        byte[] bt= baosTest();
        System.out.println(new String(bt));
    }

    public static byte[] baosTest()throws Exception{
        byte[] flush =new byte[1024];
        BufferedInputStream bis= new BufferedInputStream(new FileInputStream("F:\\闽南师范大学\\day12\\练习\\水浒传.txt"));
        //读完文档之后我不想马上用，用来存文档里读取的字节流
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int len=0;
        while((len=bis.read(flush))!=-1){
            baos.write(flush);
        }
        return baos.toByteArray();
    }

    public static byte[] test()throws Exception{
        FileInputStream fileInputStream = new FileInputStream(new File("F:\\闽南师范大学\\day12\\练习\\水浒传.txt"));
        BufferedInputStream bis = new BufferedInputStream(fileInputStream);
        byte[] bt= new byte[1024];
        while((bis.read(bt))!=-1){
            System.out.println(new String(bt));
        }
        bis.close();
        //无法正常返回，因为bt每次读取都在刷新
        return bt;
    }
}
