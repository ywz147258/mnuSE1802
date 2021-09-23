package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ADate {

    /**
     * 1.计算今天诞生到这个世界的天数
     * 2021-12-02
     * 2021 12 2
     */
    public static void birthdayDiff(int year,int month,int day){
        //凡是计算日期，一般就是用时间戳
        long nowStamp=System.currentTimeMillis();
        Calendar birthCalendar= Calendar.getInstance();
        birthCalendar.set(year,month,day);
        long birthsTamp=birthCalendar.getTime().getTime();
        //时间差
        long diffDate =  nowStamp-birthsTamp;
        System.out.println(diffDate/1000/60/60/24);
    }

    /**
     * N天之后是何年何月何日
     */
    public static void afterDay(int day){
        //当前时间戳
        long nowStamp = System.currentTimeMillis();
        long afterStamp= 500L*24*60*60*1000;
        //N天之后的时间戳
        afterStamp+=nowStamp;
        Date date = new Date(afterStamp);
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        String dateStr=sdf.format(date);
        System.out.println(dateStr);
    }

    public static void main(String[] args) {
        birthdayDiff(1990,7,21);
        afterDay(500);
    }
}
