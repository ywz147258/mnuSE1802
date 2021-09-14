package practise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AFile {
    public static void main(String[] args) throws Exception {
        FileReader fr= new FileReader(new File("F:\\闽南师范大学\\day12\\练习\\三国演义.txt"));
        StringBuffer sb =new StringBuffer();
        //刘备出现的次数
        int lbNum=0;
        char[] chars= new char[1024];
        while((fr.read(chars))!=-1){
            String result= new String(chars);
            String[] lbs= result.split("刘备");
            lbNum+=lbs.length-1;
        }
        System.out.println("刘备出现的次数为:"+lbNum);
        fr.close();
    }
}
