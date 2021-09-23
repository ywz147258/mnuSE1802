package practice.area;

public class Circle extends MyShape{
    //半径
    public Double radius;

    private static final Double PI = 3.1415926;

    public Circle(){

    }

    public Circle(Double radius){
        this.radius= radius;
    }

    @Override
    public Double getArea() {
        //计算面积
        return super.getArea();
    }

    @Override
    public Double getLen() {
        //计算周长
        return super.getLen();
    }
}
