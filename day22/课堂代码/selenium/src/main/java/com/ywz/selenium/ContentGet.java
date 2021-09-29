package com.ywz.selenium;

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

public class ContentGet {
    public static void main(String[] args) {

    }

    public void get(){
        File file = new File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\ChromeDriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NONE);
        WebDriver driver = new ChromeDriver(options); //新建一个WebDriver 的对象，但是new 的是FirefoxDriver的驱动
        driver.get("https://www.xbiquge.la/76/76984/33535205.html");
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
            FileWriter fw = new FileWriter(new File(path+"\\1.txt"));
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
