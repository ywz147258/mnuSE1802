package Practise;

import java.io.File;

public class BFile {
    public static void main(String[] args) {
        BFile bFile = new BFile();
        bFile.printFiles("E:\\cf\\");

    }

    public void printFiles(String path){
        File file = new File(path);
        String[] files= file.list();
        for(String str:files){
            File fileSub= new File(path+str);
            if(fileSub.isDirectory()){
                if(fileSub.getPath().indexOf("$")<0){
                    System.out.println("文件夹:"+fileSub.getPath());
                    printFiles(fileSub.getPath()+"\\");
                }
            }else{
                System.out.println("文件:"+fileSub.getPath());
            }
        }
    }
}
