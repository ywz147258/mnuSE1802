package enumP;

public enum Sex {
    MAN(1,"男人"),
    WOMEN(2,"女人"),
    MISS(3,"保密"),
    UNKNOWN(4,"未知");

    private Integer number;
    private String name;

    Sex(Integer number, String name) {
        this.number = number;
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
