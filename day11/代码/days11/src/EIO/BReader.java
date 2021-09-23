package EIO;

import java.io.FileReader;

public class BReader {
    public static void main(String[] args) throws Exception {
        //读文件
        FileReader fileReader= new FileReader("e:\\test.txt");
        int num=0;
        while((num=fileReader.read())!=-1){
            System.out.print((char)num);
        }
        fileReader.close();

        //读取文件方式2
        FileReader fr2= new FileReader("e:\\test1.txt");
        char[] ch=new char[20];
        while((fr2.read(ch))!=-1){
            System.out.println(new String(ch));
        }
        fr2.close();

//        char[] ch2= {'a','b'};
//        System.out.println(new String(ch2));
    }
}
