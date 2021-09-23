package abstractPg;

public class Person extends Ghost{



    public Person(){
        System.out.println("person 构造函数");
    }

    @Override
    public void test() {
        System.out.println("person test");
    }
}
