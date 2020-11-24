package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTest {
    WebDriver driver;

    @BeforeClass
    public void BeforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Hilel\\chromedriverv2\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://google.com");
    }


    @Test
    public void checkPage() {

    }
    @AfterClass
    public void afterMethod() {
        driver.quit();
    }
}
