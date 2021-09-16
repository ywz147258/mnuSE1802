package practise;

import java.io.*;
import java.util.*;

public class AIO {
    public static void main(String[] args)throws Exception {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入账号");
        String userName=scanner.next();


        Map<String,Object> map =getUserInfo();
        String oUserName=map.get("userName").toString();//ywz
        String oPsw= map.get("psw").toString();//123

        if(!userName.equals(oUserName)){
            System.out.println("账号输入错误");
        }else{
            System.out.println("可以修改密码,请输入原密码");
             String psw = scanner.next();
             if(!psw.equals(oPsw)){
                 System.out.println("输入的密码和原密码不一致");
             }else{
                 System.out.println("请输入新密码");
                 String newPsw = scanner.next();
                 System.out.println("正在修改密码");
                 updatePsw(newPsw);
                 System.out.println("修改密码成功");
             }
        }

    }

    /**
     * 修改密码
     * @param psw
     */
    public static void updatePsw(String psw)throws Exception{
        // 1.读文件
//        File file = new File("F:\\闽南师范大学\\day14\\练习\\账号密码.txt");

        //2.放到硬盘(读)
        FileReader fr= new FileReader(new File("F:\\闽南师范大学\\day14\\练习\\账号密码.txt"));
        //3.放到缓存(读)
        BufferedReader br = new BufferedReader(fr);
        //保存原来的数据到 list 临时变量
        List<String> list= new ArrayList<>();
        String result= null;
        while((result=br.readLine())!=null){
            list.add(result);
        }

        //2.放到硬盘(写)
        FileWriter fileWriter = new FileWriter(new File("F:\\闽南师范大学\\day14\\练习\\账号密码.txt"));
        BufferedWriter bw = new BufferedWriter(fileWriter);

        for(String str:list){
            // 读到了密码，先不要写
            if(str.indexOf("passWord")!=-1){
                bw.write("passWord="+psw);
            }else{
                bw.write(str);
                bw.newLine();
            }
        }
        bw.flush();
        br.close();
        fr.close();
        bw.close();
        fileWriter.close();
    }

    /**
     * 获取账号密码
     * @return
     * @throws Exception
     */
    public static Map<String,Object> getUserInfo()throws Exception{
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
        br.close();
        fr.close();
        Map<String,Object> map =new HashMap<>();
        map.put("userName",userName);
        map.put("psw",psw);
        return map;
    }
}
