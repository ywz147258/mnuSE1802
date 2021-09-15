package ASerializable;

import java.io.*;

public class DogMain {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog("大狗",1);
        unSerialize(serialize(dog));
    }

    /**
     * 序列化
     * @param dog
     * @return
     * @throws Exception
     */
    public static byte[] serialize(Dog dog)throws Exception{
        ByteArrayOutputStream bos =new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(bos);
        objectOutputStream.writeObject(dog);
        return bos.toByteArray();
    }

    public static void unSerialize(byte[] bts) throws Exception {
        ByteArrayInputStream bis = new ByteArrayInputStream(bts);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Dog dog= (Dog) ois.readObject();
        System.out.println(dog);
    }
}
