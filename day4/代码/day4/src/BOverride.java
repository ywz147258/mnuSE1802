/**
 * 方法的重载
 */
public class BOverride {

    private String name;
    public BOverride(){

    }

    public BOverride(String name){
        this.name=name;
    }

    /**
     * 同一个方法名不能重复
     * @param a
     * @param b
     */
    public void add(Integer a,Integer b){

    }


    public void add(Integer a,Integer b,Integer c){

    }


}
