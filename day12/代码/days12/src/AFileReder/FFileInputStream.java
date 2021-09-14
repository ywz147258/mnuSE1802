package AFileReder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FFileInputStream {
    public static void main(String[] args)throws Exception {
        FileInputStream fis = new FileInputStream(new File("F:\\闽南师范大学\\day12\\练习\\水浒传"));
        byte[] bt= new byte[1024*1024];

        while((fis.read(bt))!=-1){
            String result= new String(bt);
            System.out.println(result);
        }
        fis.close();

        copy();
    }


    /**
     * 拷贝图片
     * @throws Exception
     */
    public static void copy() throws Exception {
        //读
        FileInputStream fis = new FileInputStream(new File("F:\\闽南师范大学\\day12\\练习\\下载.jpg"));
        //写
        FileOutputStream fos = new FileOutputStream(new File("F:\\闽南师范大学\\day12\\练习\\下载1.jpg"));
        //遍历
        byte[] bt= new byte[1024];
        while((fis.read(bt))!=-1){
            fos.write(bt);
        }
        fos.flush();
        fos.close();
        fis.close();
    }
}
