package ADate;

import java.time.LocalDate;

public class BLocateDate {
    public static void main(String[] args) {
        //用当前日期生成LocalDate
        LocalDate date1=LocalDate.now();
        System.out.println(date1);

        //使用指定数字生成LocalDate
        LocalDate date2=LocalDate.of(2013, 12, 9);
        System.out.println(date2);

        //返回各字段值
        System.out.println("年："+date2.getYear()+" 月："+date2.getMonthValue()
                +" 日："+date2.getDayOfMonth());
        //将字符串转换
        String str="2001-09-12";
        LocalDate date3=LocalDate.parse(str);
        System.out.println("date3: "+date3);



    }
}
