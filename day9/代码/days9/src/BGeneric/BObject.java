package BGeneric;

public class BObject {

    //用一个方法就能接收多种类型的参数
    public static void test(Object t){
        System.out.println(t);
    }

    //可以少写很多代码
    public static void test(String str){}
    public static void test(Integer i){}
    public static void test(Double d){}


    public static void main(String[] args) {
        String str = new String("ywz");
        test(str);
        test(new Integer(112));
    }
}
