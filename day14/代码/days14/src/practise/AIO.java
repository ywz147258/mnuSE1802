package practise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class AIO {
    public static void main(String[] args)throws Exception {
        // 1.读文件
        File file = new File("F:\\闽南师范大学\\day14\\练习\\账号密码.txt");
        //2.放到硬盘
        FileReader fr= new FileReader(file);
        //3.放到缓存
        BufferedReader br = new BufferedReader(fr);
        String userName =null;
        String psw= null;
        String result= null;
        while((result=br.readLine())!=null){
            String loginInfo[] = result.split("=");
            if(loginInfo.length>0){
                if(loginInfo[0].equals("userName")){
                    userName=loginInfo[1];
                }
                if(loginInfo[0].equals("passWord")){
                    psw=loginInfo[1];
                }
            }
        }
        System.out.println("userName="+userName+",psw="+psw);
        br.close();
        fr.close();
    }
}
