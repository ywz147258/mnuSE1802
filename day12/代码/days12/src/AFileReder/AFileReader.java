package AFileReder;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 使用fileReader+fileWriter进行复制
 */
public class AFileReader {
    public static void main(String[] args) throws Exception{
        //路径里不要出现中文
        FileReader fr1= new FileReader(new File("F:\\闽南师范大学\\day12\\练习\\三国演义.txt"));
        FileWriter fr2= new FileWriter(new File("F:\\闽南师范大学\\day12\\练习\\三国演义2.txt"),true);

        int num =0;
        while((num=fr1.read())!=-1){
            fr2.write((char)num);
        }
//        //第二种会加null进去
//        char[] chars=new char[1024];
//        while((fr1.read(chars))!=-1){
//            System.out.println(chars);
//            fr2.write(chars);
//
//        }
        fr2.flush();
        fr2.close();
    }
}
