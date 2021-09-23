package exceptionP;

public class TryCatch {
    public static void main(String[] args) {
        try{
//            Integer i=1;
//            System.out.println(i/0);

            Integer a[]={1,2,3};
            System.out.println(a[3]);

        }catch (NullPointerException ne){
            System.out.println("空指针异常");
        } catch (ArithmeticException ae){
            System.out.println("计算异常");
        }catch (RuntimeException re){
            System.out.println("运行时异常");
        }catch (Exception e){
            System.out.println("异常");
        }

        System.out.println("最后一行代码");

        //try catch 优化
        //只放有可能会出问题的代码段
        Integer i;
        try{
            i=1;
            System.out.println(i/0);
        }catch(Exception e){
            e.printStackTrace(); //printStackTrace 会把过程告诉你
            System.out.println(e.getMessage());//getMessage 只告诉你结果
        }
    }




}
