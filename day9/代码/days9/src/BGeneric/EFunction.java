package BGeneric;

public class EFunction<T> {
    public  void print(T i){
        System.out.println(i);
    }

    public static<T> void printS(T i){
        System.out.println(i);
    }

    public static<T> void printArray(T[] ts){
        for(T t:ts){
            System.out.println(t);
        }
    }


    public static void main(String[] args) {
//        EFunction<String> function = new EFunction<>();
//        function.print(new String("Ywz"));
        EFunction.printS(2);
        Integer is[]={1,2,3,4,5};
        printArray(is);
        FBook books[]={new FBook("斗破苍穹",10),new FBook("斗罗大陆",20)};
        printArray(books);
    }

}
