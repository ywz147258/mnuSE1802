package Practise;

/**
 * 商品
 */
public class Goods implements Comparable<Goods>{
    public Goods(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private Integer price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public int compareTo(Goods o) {
        return o.getPrice()-price;
    }

    @Override
    public String toString() {
        return "[name="+name+",price="+price+"]";
    }
}
