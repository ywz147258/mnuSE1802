package exceptionP;

public class LoginService {

    public void login(String userName,String psw) throws Exception {
        //如果userName不等于admin 或者 psw不等于admin 就说明账号密码错误
        if(!userName.equals("admin")||!psw.equals("admin")){
           throw new Exception("账号密码错误");
        }
    }


    public boolean math(Integer j){
        Integer i=1;
        try{
            System.out.println(1);
            System.out.println(i/j);
            return true;
        }catch (Exception e){
            System.out.println(2);
            e.printStackTrace();
            return false;
        }finally {
            System.out.println(3);
        }
    }

}
