package ADate;

import java.time.LocalTime;

public class CLocalTime {
    public static void main(String[] args) {
        //用当前日期生成LocalTime
        LocalTime time1=LocalTime.now();
        System.out.println("time1: "+time1);
        //使用指定数字生成LocalTime
        LocalTime time2=LocalTime.of(20, 12, 9);
        System.out.println("time2: "+time2);
        //返回各字段值
        System.out.println("时："+time2.getHour()+" 分："+time2.getMinute()+" 秒："+time2.getSecond());
        //将字符串转换
        String str="12:34:09";
        LocalTime time3=LocalTime.parse(str);
        System.out.println("time3: "+time3);

    }
}
