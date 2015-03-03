import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rchakr6344c\\Desktop\\OneDrive\\Development Stuff\\Selenium\\AdDelivery4.0Admin\\libs\\chromedriver.exe");
        System.out.println("Hello World!");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.utexas.edu");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        WebDriver chdriver = new ChromeDriver();
        chdriver.get("http://www.google.com");


    }
}