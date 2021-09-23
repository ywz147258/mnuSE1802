package BGeneric.GInteface.entity;

public class NineMiBullet {
    //子弹名称
    private String name;

    public String getName() {
        return name;
    }

    public NineMiBullet(String name, Integer power) {
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

    //子单威力
    private Integer power;
}
