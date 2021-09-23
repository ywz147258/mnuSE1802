package enumP;

public enum Project {
    ENGLISH("001","英语"),
    CHINESE("002","语文");
    private String name;
    private String number;
    Project(String number, String name) {
        this.name = name;
        this.number = number;
    }
    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
