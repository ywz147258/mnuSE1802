package BGeneric;

public class CSimpleGen2<T> {

    private T t;

    public CSimpleGen2(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        CSimpleGen2<Integer> simpleGen1= new CSimpleGen2(new Integer(11));
        Integer i =(Integer) simpleGen1.getT();
        System.out.println(i);

        CSimpleGen2<String> simpleGen2 = new CSimpleGen2(new String("22"));
//        System.out.println((Integer) simpleGen2.getT());
    }
}
