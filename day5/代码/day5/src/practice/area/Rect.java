package practice.area;

public class Rect extends MyShape{
    public Double height;
    public Double weight;

    public Rect(){

    }

    public Rect(Double height,Double weight){
        this.height=height;
        this.weight=weight;
    }

    @Override
    public Double getArea() {
        //计算面积
//        return super.getArea();
        return height*weight;
    }

    @Override
    public Double getLen() {
        //计算周长
        return 2*height+2*weight;
    }
}
