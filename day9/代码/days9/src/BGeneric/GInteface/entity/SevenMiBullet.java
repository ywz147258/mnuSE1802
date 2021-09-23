package BGeneric.GInteface.entity;

public class SevenMiBullet {
    //子弹名称
    private String name;
    //子单威力
    private Integer power;

    public String getName() {
        return name;
    }

    public SevenMiBullet(String name, Integer power) {
        this.name = name;
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }
}
