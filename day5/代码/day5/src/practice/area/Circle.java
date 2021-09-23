package practice.area;

public class Circle extends MyShape{
    //半径
    private Double radius;

    Double r2;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    private static final Double PI = 3.1415926;

    public Circle(){

    }

    public Circle(Double radius){
        this.radius= radius;
    }

    @Override
    public Double getArea() {
        //计算面积
        return PI*(radius*radius);
    }

    @Override
    public Double getLen() {
        //计算周长
        return 2*PI*radius;
    }
}
