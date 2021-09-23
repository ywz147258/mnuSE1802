package practice;

/**
 * 字符串工具类
 */
public class StringUtil {
    /**
     * 手机号脱敏
     * 输入一个手机号，把手机号的 4-8位 变成*并输出
     * @param tel
     */
    public static String telDesensitize(String tel){
        String number=tel.substring(3,7);
        tel=tel.replace(number,"****");
        return tel;
    }


    /**
     * 姓名脱敏
     * 数入一个姓名，只打印 姓，名改成*
     * @param name
     * @return
     */
    public static String nameDesensitize(String name){
        String last=name.substring(1,name.length());
        StringBuffer sb= new StringBuffer();
        for(int i=0;i<last.length();i++){
            sb.append("*");
        }
        name=name.replace(last,sb);
        return name;
    }

    /**
     * 身份证脱敏
     * 输入一个身份证 把18的身份证缩减到10并加密
     * @return
     */
    public static String idCardDesensitize(String idCard){
        //删除 从第四位开始 到 倒数第四位结束
        String number= idCard.substring(3,idCard.length()-4);
        idCard=idCard.replace(number,"****");
        return idCard;

    }
}
