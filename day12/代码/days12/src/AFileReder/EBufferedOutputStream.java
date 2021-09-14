package AFileReder;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class EBufferedOutputStream {
    public static void main(String[] args)throws Exception {
        // FileWriter
        //BufferedWriter
        FileOutputStream fos= new FileOutputStream(new File("F:\\闽南师范大学\\day12\\练习\\水浒传.txt"));
        BufferedOutputStream bos= new BufferedOutputStream(fos);
        bos.write("你挑着蛋".getBytes());
        bos.write("\n".getBytes());
        bos.flush();
        bos.close();

    }
}
