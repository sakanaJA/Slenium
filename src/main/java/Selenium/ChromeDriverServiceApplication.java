package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverServiceApplication {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\pleiades-2022-12-java-win-64bit-jre_20230204\\workspace\\ChromeDriverService\\exe\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //検索文言
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q")); 
        searchBox.sendKeys("今日も一日がんばるぞい!");
        driver.findElement(By.name("q")).sendKeys("今日も一日がんばるぞい!");

       // driver.findElement(By.name("q")).sendKeys("今日も一日がんばるぞい!");


//        WebElement searchBox = driver.findElement(By.name("q"));
//
//        searchBox.sendKeys("今日も一日がんばるぞい!");

        searchBox.submit();
        
        WebElement element = driver.findElement(By.id("dimg_9"));
        element.click();
        
        
        WebElement element1 = driver.findElement(By.linkText("Twitter"));
        element1.click();


        // 閉じる
       // driver.quit();
    }
}
