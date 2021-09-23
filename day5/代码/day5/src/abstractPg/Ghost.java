package abstractPg;

/**
 * 抽象类
 */
public abstract class Ghost {
    private Integer age=10;
    private final String name="ywz";
    public static void add(Integer a,Integer b){
        System.out.println(a+b);
    }

    public Ghost(){
        System.out.println("ghost 构造函数");
    }

    /**
     * 抽象方法
     */
    public  abstract void test();
}
