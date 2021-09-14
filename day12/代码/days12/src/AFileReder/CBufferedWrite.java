package AFileReder;

import java.io.*;

public class CBufferedWrite {
    public static void main(String[] args) throws Exception {
//        Writer writer = new FileWriter("F:\\闽南师范大学\\day12\\练习\\三国演义2.txt");
//        BufferedWriter bw= new BufferedWriter(writer);
//        bw.write("ywz");
//        bw.newLine();
//        bw.write("hello");
//        bw.flush();
//        bw.close();
//        writer.close();

        copy();
    }

    /**
     * 复制
     * @throws Exception
     */
    public static void copy() throws Exception{
        //读取
        FileReader fr= new FileReader("F:\\闽南师范大学\\day12\\练习\\三国演义.txt");
        BufferedReader br= new BufferedReader(fr);
        //写
        FileWriter fw = new FileWriter("F:\\闽南师范大学\\day12\\练习\\三国演义1.txt");
        BufferedWriter bw= new BufferedWriter(fw);

        String result= null;
        while((result=br.readLine())!=null){
            bw.write(result);
            bw.newLine();
        }
        bw.flush();
        bw.close();;
        fw.close();
        br.close();
        fr.close();
    }
}
