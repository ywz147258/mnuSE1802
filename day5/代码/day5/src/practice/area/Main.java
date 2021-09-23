package practice.area;

public class Main {
    public static void main(String[] args) {
        MyShape circle= new Circle(5.0);
        Calculator calculator =new Calculator();
        //计算圆的面积
        Double area= calculator.getArea(circle);
        //计算圆的周长
        Double len= calculator.getLen(circle);

        MyShape rect =new Rect(10.0,20.0);
        //计算长方形的面积
        Double rectArea= calculator.getArea(rect);

        //计算长方形的周长
        Double rectLen=calculator.getLen(rect);

        System.out.println(area);
    }
}
