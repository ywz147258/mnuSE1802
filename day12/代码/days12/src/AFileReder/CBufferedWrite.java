package AFileReder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class CBufferedWrite {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("F:\\闽南师范大学\\day12\\练习\\三国演义2.txt");
        BufferedWriter bw= new BufferedWriter(writer);

        bw.write("ywz");
        bw.newLine();
        bw.write("hello");
        bw.flush();
        bw.close();
        writer.close();
    }
}
