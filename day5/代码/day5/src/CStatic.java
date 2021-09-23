import java.util.Arrays;

public class CStatic {

    static {
        System.out.println("CStatic的静态代码块");
    }

    public CStatic(){
        System.out.println("CStatic的构造函数");
    }

    public static Integer a=10;

    public static void test(){
        System.out.println("test");
    }

    public void login(){
        saveUser();
        test();

    }

    public void saveUser(){

    }

    public static void main(String[] args) {
        CStatic static1=new CStatic();
        static1.a+=1;
        System.out.println(static1.a);

        CStatic static2=new CStatic();
        static2.a+=1;
        System.out.println(static2.a);

        CStatic.a+=1;
        System.out.println(CStatic.a);
    }
}
