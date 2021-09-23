package BString;

import java.util.Locale;

public class AString {
    public static void main(String[] args) {
        String str="游文智";
        str+="是最帅的";
        str+="最棒的";
//        System.out.println(str);

        String name ="ABCDefgB";
        System.out.println(name.substring(0,3));
        System.out.println(name.substring(3));
        //在当前的字符串中 该字符位于哪里
        System.out.println(name.indexOf("B"));
        System.out.println(name.indexOf("B",3));
        //获取下标为3的字符
        System.out.println(name.charAt(3));
        //倒数出现
        System.out.println(name.lastIndexOf("B"));

        //强转
        String age=String.valueOf(11);
        System.out.println("age="+age);
        System.out.println(String.valueOf(false));

        String upperC="CHINA";
        System.out.println(upperC.toLowerCase());
        String lowerC="ywz";
        System.out.println(lowerC.toUpperCase());

        //替代
        //查询违禁字并修改成**
        String illegalChars="我是sb";//我是**
        if(illegalChars.indexOf("sb")!=-1){
            System.out.println("这串字符里包含了违禁字");
            illegalChars=illegalChars.replace("sb","**");
        }
        System.out.println(illegalChars);

        //length 方法
        System.out.println(illegalChars.length());
    }
}
