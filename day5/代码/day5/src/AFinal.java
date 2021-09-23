/**
 * final关键字
 */
public final class AFinal {

    public final Integer AGE=10;

    public final Integer height;

    public AFinal(){
        //只能在构造函数里赋值
        height=10;
    }
    public final void write(){
        System.out.println("write");
    }

    public void login(final String userName,final String psw){
//        userName="ywz";
    }


}

