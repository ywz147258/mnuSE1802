package ADate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ADate {
    public static void main(String[] args) {
        Date  date = new Date();
        //yyyy 2021,M 9,MM 09,d 8,dd 08,H 5,HH 05,mm ss 都一样，都是不足10，会补一个0
        // F 一个月的第几个星期 E中文的星期几
        SimpleDateFormat sdf=new  SimpleDateFormat("yy/M-d HH:mm:ss F E");
        String result=sdf.format(date);
        System.out.println(result);

        //获取年
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        //获取
        System.out.println(calendar.get(Calendar.MONTH)+1);

        //现在距离 国庆还有几天
        //计算逻辑 把今天转成时间戳 把国庆转成时间戳
        Date nationalDay =new Date("2021/10/1");
        long r=nationalDay.getTime()-date.getTime();
        r=r/1000/60/60/24;
        System.out.println(r);


        Calendar nc= Calendar.getInstance();
        nc.set(2021,9,1,0,0,0);
        long r2=nc.getTime().getTime()-date.getTime();
        r2=r2/1000/60/60/24;
        System.out.println(r2);

        //System.currentTimeMillis 获取当前时间戳
        System.out.println(System.currentTimeMillis());

        //after 是否在参数日期
        Date d1= new Date("2021/10/21");
        Date d2= new Date("2021/10/23");
        System.out.println(d1.after(d2));

        //DateFormat
        DateFormat format1 = DateFormat.getDateInstance();
        DateFormat format2 = DateFormat.getTimeInstance();
        DateFormat format3 = DateFormat.getDateTimeInstance();
        System.out.println(format1.format(new Date()));
        System.out.println(format2.format(new Date()));
        System.out.println(format3.format(new Date()));
    }
}
