package BEnum;

public enum Sex {
    MAN(1,"男"),
    WOMEN(2,"女"),
    MISS(3,"未知");

    Sex(Integer no, String name) {
        this.no = no;
        this.name = name;
    }

    public Integer getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    private Integer no;
    private String name;
}
