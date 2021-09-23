package practice;

import java.util.Random;

public class RandomTest {

    /**
     * 1.取 10-30间的随机数
     * @return
     */
    public static Integer getRandomLimit(){
        Integer result=(int)(Math.random()*100)%21+10;
        return result;
    }

    /**
     * 取 10-30间 偶数的随机数
     * @return
     */
    public static Integer getRandomLimitEven(){
        boolean isContinue=true;
        Integer result=0;
        while(isContinue){
            result=(int)(Math.random()*100)%21+10;
            if(result%2==0){
                isContinue=false;
            }
        }
        return result;
    }

    /**
     * 生成四位数的整数验证码
     * @return
     */
    public static Integer verify(){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<4;i++){
           Integer r= new Random().nextInt(9);
           sb.append(r);
        }
        return Integer.parseInt(sb.toString());
    }

    /**
     * 生成一个四位数包含大写字母的验证码
     * @param p
     * @return
     */
    public static String verifyChar(Integer p){
        //65-90 A-Z
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<p;i++){
            int c= new Random().nextInt(25)+65;
            //本次到底是数字还是字符
            int r= new Random().nextInt(2);
            if(r==0){
                sb.append((char) c);
            }else{
                sb.append(new Random().nextInt(9));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
//        getRandomLimit();
//        System.out.println(getRandomLimitEven());
//        System.out.println(verify());
        System.out.println(verifyChar(10));

    }
}
