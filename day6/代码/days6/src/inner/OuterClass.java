package inner;
//外部类
public class OuterClass {

    public static String name ="ywz";

    private Integer age=10;


    public void test(){

    }
    //内部类 成员内部类
    public class InnerClass{
//        public static int age1 = 631;//报错
//        public static void write(){}//报错
        public void test1(){
            System.out.println(age);
        }
    }

    public void display(int height){
        //局部内部类
        class InnerClass1{
            public InnerClass1(){
                age=height;
                System.out.println(height);
            }

            public void test2(){
                age=20;
                System.out.println(height);
            }
        }
        //在方法里把局部内部类实例化
        InnerClass1 innerClass1 = new InnerClass1();
        innerClass1.test2();
    }

    //静态内部类
    public static class InnerClass2{
        public InnerClass2(){

        }
        public  static String sex="男";
        public void write(){
            System.out.println(name);
        }
    }

    //匿名内部类
    public IFoo foo =new IFoo() {

        public void test3(){
            System.out.println("test3");
        }
    };


    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        //成员内部的实例化
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.test1();
        outerClass.display(30);
        //静态内部类的实例化
        OuterClass.InnerClass2 innerClass1= new OuterClass.InnerClass2();
        outerClass.foo.test3();
    }
}
