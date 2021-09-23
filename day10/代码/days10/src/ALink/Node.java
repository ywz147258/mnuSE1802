package ALink;

public class Node {

    private Integer value;
    private Integer key;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node next;

    public Node( Integer key,Integer value) {
        this.value = value;
        this.key = key;
    }
}
