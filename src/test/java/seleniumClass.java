import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.Assert;



import java.time.Duration;


public class seleniumClass {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32 (2)\\chromedriver-win32\\chromedriver.exe");
        //"C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe"
        driver = new ChromeDriver();

    }
    @Test
    public void open(){
        driver.get("https://qamoviesapp.ccbp.tech");
    }





}