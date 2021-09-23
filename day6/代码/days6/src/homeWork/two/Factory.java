package homeWork.two;

public class Factory {
    public Car create(){
        Integer i =(int)(Math.random()*100)%3;
        if(i==0){
            return new Benz();
        }else if(i==1){
            return new Bmw();
        }else{
            return new Porsche();
        }
    }
}
