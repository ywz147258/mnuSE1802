package ADate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DDateTimeFormatter {
    public static void main(String[] args) {
        //创建DateTimeFormatter对象
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("hh时mm分ss秒");
        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("yyyy/MM/dd hh时mm分ss秒");
//      创建LocalDate、LocalTime、LocalDatetime对象
        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();
        LocalDateTime datetime=LocalDateTime.now();
//		进行格式化
        System.out.println(date.format(dtf1));
        System.out.println(time.format(dtf2));
        System.out.println(datetime.format(dtf3));


    }
}
