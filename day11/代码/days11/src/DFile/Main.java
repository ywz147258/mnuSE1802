package DFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
//        getInfo();
//        create();
//        judge();
        list();
    }

    //获取文件基本信息
    public void getInfo(){
        File file = new File("e:\\test.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());
        Date date = new Date(file.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time= sdf.format(date);
        System.out.println(time);
    }

    //创建
    public static void create() throws IOException {
        File fileDir = new File("e:\\ywz\\test");
        File file = new File("e:\\ywz\\test\\ywz.java");
//        file.mkdir();
        fileDir.mkdirs();
        file.createNewFile();
    }

    //判断
    public static void judge(){
        File file = new File("e:\\ywz\\test\\ywz.java");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }

    //文件下的所有内容
    public static void list(){
        File file =new File("e:\\");
        String[] files= file.list();
        for(String str:files){
            System.out.println(str);
        }
    }
}
