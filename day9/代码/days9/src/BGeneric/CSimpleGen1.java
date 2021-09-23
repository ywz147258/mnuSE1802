package BGeneric;


public class CSimpleGen1 {
    private Object object;

    public CSimpleGen1(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static void main(String[] args) {
        CSimpleGen1 simpleGen1= new CSimpleGen1(new Integer(11));
        Integer i =(Integer) simpleGen1.getObject();
        System.out.println(i);

        CSimpleGen1 simpleGen2 = new CSimpleGen1(new String("22"));
        System.out.println((Integer) simpleGen2.getObject());
    }
}
