package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Test32_1 {
    WebDriver wd;

    @BeforeMethod
    public void preConditions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:/Users/susan/Documents/QA_32Start/chromedriver.exe");
        wd.navigate().to("https://trello.com/");
    }

    @Test 
            public void test1() {
        WebElement el = wd.findElement(By.tagName("a"));
        WebElement el2 = wd.findElement(By.tagName("div"));
        WebElement el22 = wd.findElement(By.cssSelector("div"));


        WebElement el3 = wd.findElement(By.id("hero"));
        WebElement el4 = wd.findElement(By.cssSelector("#hero"));
        WebElement e144 = wd.findElement(By.xpath("//*[@id='hero']"));

        WebElement el5 = wd.findElement(By.linkText("Sign up"));
        WebElement el6 = wd.findElement(By.cssSelector("[href='/signup']"));

        WebElement e17 = wd.findElement(By.cssSelector("[data-analytics-screen='homeScreen']"));
        WebElement e18 = wd.findElement(By.cssSelector("[data-analytics-screen *='Screen']"));
        WebElement e19 = wd.findElement(By.cssSelector("[data-analytics-screen ^='ho']"));
        WebElement e20 = wd.findElement(By.cssSelector("[data-analytics-screen $='een']"));

        WebElement e21 = wd.findElement(By.xpath("//*[@data-analytics-screen='homeScreen']"));
        WebElement e22 = wd.findElement(By.xpath("//*[contains(@data-analytics-screen='Screen')]"));
        WebElement e23 = wd.findElement(By.xpath("//*[start-with(@data-analytics-screen='ho')]"));

    }
    @Test
    public void test2(){
        List<WebElement> eln = wd.findElements(By.tagName("a"));
        System.out.println(eln.size());

    }
    @Test
    public void enterPositiveEmail(){
        WebElement elm = wd.findElement(By.cssSelector("input[name='email']"));
        type(elm,"susanln@mail.ru");

    }

    public void type(WebElement elm, String text) {
        elm.click();
        elm.clear();
        elm.sendKeys(text);
    }
    @Test
    public void negativeEmail(){
        WebElement elm = wd.findElement(By.cssSelector("input[name='email']"));
        type(elm,"susanlnmail.ru");
    }

    @AfterMethod
    public void postConditions(){
        wd.close();
        wd.quit();
    }
}