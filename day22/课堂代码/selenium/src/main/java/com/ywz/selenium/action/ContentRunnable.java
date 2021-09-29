package com.ywz.selenium.action;

import com.ywz.selenium.dao.IndexDao;
import com.ywz.selenium.entity.Index;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ContentRunnable implements Runnable {
    private int start;
    private int limit;
    public ContentRunnable(int start ,int limit){
        this.start=start;
        this.limit=limit;
    }

    @Override
    public void run() {
        IndexDao indexDao = new IndexDao();
        List<Index> list = indexDao.selectLimit(start,limit);
        for(Index index :list){
            get(index.getHref(),index.getTitle());
        }
    }



    public static void get(String href,String number){
        File file = new File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\ChromeDriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NONE);
        WebDriver driver = new ChromeDriver(options); //新建一个WebDriver 的对象，但是new 的是FirefoxDriver的驱动
        driver.get(href);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement content = driver.findElement(By.id("content"));

        String path ="F:\\小说\\封神之我没想和女娲谈恋爱";
        File file2= new File(path);
        if(!file2.exists()){
            file2.mkdirs();
        }
        try {
            FileWriter fw = new FileWriter(new File(path+"\\"+number+".txt"));
            BufferedWriter bw= new BufferedWriter(fw);
            bw.write(content.getText());
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(content.getText());
        driver.quit();
    }
}
