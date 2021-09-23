package homeWork.three;

public class Project {
    public Integer getpNumber() {
        return pNumber;
    }

    public void setpNumber(Integer pNumber) {
        this.pNumber = pNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    private Integer pNumber;
    private String name;
    private boolean isOpen;

    public Project(Integer pNumber, String name, boolean isOpen) {
        this.pNumber = pNumber;
        this.name = name;
        this.isOpen = isOpen;
    }
}
