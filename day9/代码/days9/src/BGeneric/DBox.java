package BGeneric;

public class DBox<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public DBox(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        DBox<String> box = new DBox<>(new String("ywz"));
        System.out.println(box.getT());
        DBox<Integer> box2 = new DBox<>(new Integer(222));
//        System.out.println((String)box2.getT());//报错
    }
}
