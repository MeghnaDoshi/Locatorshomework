
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Guru99 {
    static protected WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/v4/");
        driver.findElement(By.name("uid")).sendKeys("mngr139695");
        driver.findElement(By.name("password")).sendKeys("YzategY");
        driver.findElement(By.name("btnLogin")).click();

        driver.findElement(By.xpath("//a [@href='addcustomerpage.php']")).click();
        driver.findElement(By.name("name")).sendKeys("Stuti");
        driver.findElement(By.name("rad1")).click();
        driver.findElement(By.name("addr")).sendKeys("56 Little oxhey Lane");
        driver.findElement(By.name("addr")).sendKeys("Watford");
        driver.findElement(By.name("state")).sendKeys("Herts");
        driver.findElement(By.name("pinno")).sendKeys("674 896");
        driver.findElement(By.name("telephoneno")).sendKeys("07642365488");
        driver.findElement(By.name("emailid")).sendKeys("Stuti123@yahoo.com");
        driver.findElement(By.name("password")).sendKeys("princess");
        driver.findElement(By.name("sub")).click();

        driver.close();
    }

}


