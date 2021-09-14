package AFileReder;

import java.io.ByteArrayInputStream;

public class JByteArrayInputStream {
    public static void main(String[] args) throws Exception {
        byte[] doc=IByteArrayOutputStream.baosTest();
        test(doc);
    }

    public  static void test(byte[] bt)throws Exception{
        //配合ByteArrayOutputStream 一起使用
        ByteArrayInputStream  bis = new ByteArrayInputStream(bt);
        byte[] result = new byte[1024];
        while((bis.read(result))!=-1){
            System.out.println(new String(result));
        }
    }
}
