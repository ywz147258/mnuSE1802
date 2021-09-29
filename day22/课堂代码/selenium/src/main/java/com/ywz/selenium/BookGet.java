package com.ywz.selenium;

import com.ywz.selenium.dao.BookDao;
import com.ywz.selenium.entity.Book;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.List;

/**
 * Hello world!
 *
 */
public class BookGet
{
    public static void main( String[] args )
    {
        BookDao bookDao = new BookDao();
        File file = new File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\ChromeDriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NONE);
        WebDriver driver = new ChromeDriver(options); //新建一个WebDriver 的对象，但是new 的是FirefoxDriver的驱动
        driver.get("https://www.xbiquge.la/xuanhuanxiaoshuo/");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement newscontent= driver.findElement(By.id("newscontent"));
        WebElement ls= newscontent.findElement(By.className("l"));
        WebElement ul = ls.findElement(By.tagName("ul"));
        List<WebElement> lis= ul.findElements(By.tagName("li"));
        //打印每本书的名字和链接
        for(WebElement webElement:lis){
            WebElement s2 = webElement.findElement(By.className("s2"));
            WebElement a = s2.findElement(By.tagName("a"));
            System.out.println(a.getText());
            System.out.println(a.getAttribute("href"));
            Book book = new Book();
            book.setName(a.getText());
            book.setHref(a.getAttribute("href"));
            bookDao.insert(book);
        }
        driver.quit();

    }
}
