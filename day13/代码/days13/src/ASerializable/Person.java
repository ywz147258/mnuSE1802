package ASerializable;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private transient String sex;

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "name:"+name+",sex:"+sex;
    }

    private void writeObject(ObjectOutputStream out) throws Exception {
        out.defaultWriteObject();
        out.writeUTF(sex+"---");
        out.writeUTF(name+"===");
    }

    private void readObject(ObjectInputStream in)throws Exception {
        in.defaultReadObject();
        sex=in.readUTF();
        name=in.readUTF();
    }
}
