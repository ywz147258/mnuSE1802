package com.ywz.selenium;

import com.ywz.selenium.dao.IndexDao;
import com.ywz.selenium.entity.Index;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.List;

public class BookIndex {
    public static void main(String[] args) {
        IndexDao indexDao = new IndexDao();
        File file = new File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\ChromeDriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NONE);
        WebDriver driver = new ChromeDriver(options); //新建一个WebDriver 的对象，但是new 的是FirefoxDriver的驱动
        driver.get("https://www.xbiquge.la/76/76984/");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement list = driver.findElement(By.id("list"));
        WebElement dl = list.findElement(By.tagName("dl"));
        List<WebElement> dds = dl.findElements(By.tagName("dd"));


        for(WebElement webElement:dds){
            WebElement a = webElement.findElement(By.tagName("a"));
//            System.out.println(a.getText());
//            System.out.println(a.getAttribute("href"));
            Index index = new Index();
            index.setTitle(a.getText());
            index.setHref(a.getAttribute("href"));
            index.setBookId(1);
            indexDao.insert(index);
        }
        driver.quit();
    }
}
