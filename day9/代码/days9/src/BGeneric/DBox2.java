package BGeneric;

public class DBox2 {
    private Object ob;

    public Object getOb() {
        return ob;
    }

    public void setOb(Object ob) {
        this.ob = ob;
    }

    public DBox2(Object ob) {
        this.ob = ob;
    }

    public static void main(String[] args) {
        DBox2 box= new DBox2(new String("ywz"));
        System.out.println(box.getOb());

        DBox2 box2= new DBox2(new Integer(222));
        System.out.println((String)box2.getOb());
    }
}
