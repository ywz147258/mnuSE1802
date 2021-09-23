package EUUID;

import java.util.UUID;

public class AUUID {
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString().replace("-",""));
    }
}
