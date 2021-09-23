package ADate;

import java.util.Calendar;

public class ACalendar {
    public static void main(String[] args) {
        //定义
        Calendar calendar = Calendar.getInstance();
        //设置时间
        calendar.set(2021,2,1);
        //获取时间戳
        System.out.println(calendar.getTime().getTime());
        //获取当前的时间，输出 yyyy-MM-dd
        Calendar calendar1= Calendar.getInstance();
        int year=calendar1.get(Calendar.YEAR);
        int month=calendar1.get(Calendar.MONTH)+1;
        int day= calendar1.get(Calendar.DATE);
        System.out.println(year+"-"+month+"-"+day);

    }
}
