package BMap;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FProperties {
    public static void main(String[] args) throws IOException {
        Properties p= new Properties();
        p.load(new FileInputStream(new File("test.properties")));
        System.out.println(p.get("name"));
        System.out.println(p.get("age"));
    }
}
