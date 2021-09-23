public class CThis {
    private String name="ywz";
    public void test(String name){
        System.out.println(this.name);
        this.test2();

    }

    public CThis(){
        this("ywz");
    }
    public CThis(String name){
        System.out.println("构造");
    }

    public void test2(){
        System.out.println("test2");
    }

    public class InnerClass{
        private String sex;

        public void test3(){
            System.out.println(this.sex);
        }
    }
}
