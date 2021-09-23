package enumP;

public enum Prototype {
    APPLEPHONE(230,14000,"苹果13"),
    XIAOMI(200,6000,"小米11");


    private Integer weight;
    private Integer price;
    private String name;

    Prototype(Integer weight, Integer price, String name) {
        this.weight = weight;
        this.price = price;
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
