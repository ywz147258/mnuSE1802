package BSerializable;

import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception{
        byte[] bts= objectCopyToByteArray();
        readObjectByteArray(bts);
    }

    /**
     * 存储对象到文档
     * @throws Exception
     */
    public static void objectCopyToDoc() throws Exception{
        Person person= new Person("游文智","男");
        //1.写到某一个具体的文档
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(new File("F:\\闽南师范大学\\day12\\练习\\person.txt")));
        oos.writeObject(person);
        oos.close();



        //2.从文档里读取信息，并转成对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(("F:\\闽南师范大学\\day12\\练习\\person.txt")));
        Person person1 = (Person) ois.readObject();
        System.out.println(person1.getName());
    }

    /**
     * 存储对象到字节流
     */
    public static byte[] objectCopyToByteArray() throws Exception{
        Person person= new Person("游文智","男");
        ByteArrayOutputStream bos =new ByteArrayOutputStream();
        ObjectOutputStream oos= new ObjectOutputStream(bos);
        oos.writeObject(person);
        return bos.toByteArray();
    }

    public static void readObjectByteArray(byte[] bts)throws Exception{
        ByteArrayInputStream bais= new ByteArrayInputStream(bts);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Person person = (Person) ois.readObject();
        System.out.println(person);
    }
}
