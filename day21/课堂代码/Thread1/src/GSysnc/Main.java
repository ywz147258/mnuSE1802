package GSysnc;

public class Main {
    public static void main(String[] args) {
        SaleTicketThread s1= new SaleTicketThread();
        s1.setName("售票员A");
        SaleTicketThread s2= new SaleTicketThread();
        s2.setName("售票员B");
        SaleTicketThread s3= new SaleTicketThread();
        s3.setName("售票员C");

        s1.start();
        s2.start();
        s3.start();
    }
}
