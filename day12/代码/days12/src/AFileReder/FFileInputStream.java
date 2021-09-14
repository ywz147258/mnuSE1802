package AFileReder;

import java.io.File;
import java.io.FileInputStream;

public class FFileInputStream {
    public static void main(String[] args)throws Exception {
        FileInputStream fis = new FileInputStream(new File("F:\\闽南师范大学\\day12\\练习\\水浒传"));
        byte[] bt= new byte[1024*1024];

        while((fis.read(bt))!=-1){
            String result= new String(bt);
            System.out.println(result);
        }
        fis.close();

    }
}
