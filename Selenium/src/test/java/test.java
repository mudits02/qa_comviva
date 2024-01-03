import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {
    public static void main(String[] args) {
        System.setProperty("Webdriver.gecko.driver", "C:\\Users\\mudit.shukla1\\Downloads\\geckodriver-v0.32.0-win64");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.zomato.com");
        
    }
}
