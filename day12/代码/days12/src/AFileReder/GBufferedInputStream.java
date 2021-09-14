package AFileReder;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class GBufferedInputStream {
    public static void main(String[] args) throws Exception{

        FileInputStream fileInputStream = new FileInputStream(new File("F:\\闽南师范大学\\day12\\练习\\水浒传.txt"));
        BufferedInputStream bis = new BufferedInputStream(fileInputStream);
        byte[] bt= new byte[1024];
        while((bis.read(bt))!=-1){
            System.out.println(new String(bt));
        }
        bis.close();
    }
}
