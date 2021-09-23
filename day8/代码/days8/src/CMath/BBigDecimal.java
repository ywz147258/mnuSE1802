package CMath;

import java.math.BigDecimal;

/**
 * 处理小数
 */
public class BBigDecimal {
    public static void main(String[] args) {
        //定义
        BigDecimal a= new BigDecimal(10.25);
        System.out.println(a);

        //加
        a=a.add(new BigDecimal(10));
        System.out.println(a);

        //减
        a=a.subtract(new BigDecimal(5));
        System.out.println(a);

        //乘
        a=a.multiply(new BigDecimal(10));
        System.out.println(a);

        //除 第一个参数是 除多少  第二个参数 精确到几位  第三个 向上 向下
        System.out.println(a.divide(new BigDecimal(5.36),6,BigDecimal.ROUND_DOWN));
        System.out.println(a.divide(new BigDecimal(5.36),6,BigDecimal.ROUND_UP));
//        System.out.println(a.divide(new BigDecimal(5.36),6,BigDecimal.ROUND_HALF_DOWN));
//        System.out.println(a.divide(new BigDecimal(5.36),6,BigDecimal.ROUND_HALF_UP));

        //小数点后的四舍五入
        System.out.println(new BigDecimal(5.367).setScale(2,BigDecimal.ROUND_UP));
        System.out.println(new BigDecimal(5.367).setScale(2,BigDecimal.ROUND_DOWN));
    }
}
