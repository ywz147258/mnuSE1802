package wrap;

public class IntegerW {
    public static void main(String[] args) {
        //2的31次幂 -1
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        Integer i= Integer.parseInt("1");
        Integer j= new Integer("2");
        System.out.println(Integer.compare(300,200));

        Integer number = new Integer(10);
        Integer number2 = 10;//自动装箱
        String str= "ywz";//自动装箱
        int number3= number;//自动拆箱

        Integer a = 128;
        Integer b = 128;
        System.out.println(a==b);   //true
        Integer c= new Integer(10);
        Integer d= new Integer(10);
        System.out.println(c==d); //false
    }
}
