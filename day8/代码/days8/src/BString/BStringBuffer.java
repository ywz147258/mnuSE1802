package BString;

public class BStringBuffer {
    public static void main(String[] args) {
        //不用于定义简单的字符串变量
        StringBuffer sb = new StringBuffer();
        sb.append("游文智");
        sb.append("最棒");
        System.out.println(sb.toString());
        //选择位置插入字符串
        sb.insert(1,"牛逼");
        System.out.println(sb.toString());
        //删除字符串
        sb.delete(1,3);
        System.out.println(sb.toString());
    }
}
