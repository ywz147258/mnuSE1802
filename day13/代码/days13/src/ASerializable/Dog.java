package ASerializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Dog implements Externalizable {

    private String name;

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name+"狗");
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name="";
        age=in.readInt();
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Dog(){

    }

    @Override
    public String toString() {
        return "[name="+name+",age="+age+"]";
    }
}
