package AFileReder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BBufferedReader {
    public static void main(String[] args) throws Exception{
        FileReader fr= new FileReader(new File("F:\\闽南师范大学\\day12\\练习\\三国演义.txt"));
        BufferedReader br = new BufferedReader(fr);
        String result = null;
        while((result=br.readLine())!=null){
            System.out.println(result);
        }
        br.close();
        fr.close();
    }
}
