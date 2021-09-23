package ADebug;

public class AMain {
    public static void main(String[] args) throws Exception {
        test(0);
    }

    public static void test(Integer i) throws Exception {
        // false时才会触发assert
        assert i>1:"i必须大于1";
        System.out.println("finally");

//        if(i<1){
//            throw new Exception("i必须大于1");
//        }
    }
}
