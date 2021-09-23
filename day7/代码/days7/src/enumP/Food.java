package enumP;

public enum Food {
    EGG("鸡蛋"),
    PORK("猪肉"),
    STEAK("牛排");
    private String name;

    Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
