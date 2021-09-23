import com.sun.org.apache.bcel.internal.classfile.InnerClass;

public class AInnerClass {

    /**
     * 内部类
     */
    public class A{
        public void test(){
            System.out.println("内部类执行方法A");
        }
    }

    public static void main(String[] args) {

        AInnerClass innerClass = new AInnerClass();
        AInnerClass.A a=innerClass.new A();
        a.test();
    }


}
