import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class YourLogo {
    static protected WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php?controller=authentication");
        driver.findElement(By.id("email_create")).sendKeys("meghakd@hotmail.com");
        driver.findElement(By.name("SubmitCreate")).click();
        driver.findElement(By.id("uniform-id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Rhys");
        driver.findElement(By.id("customer_lastname")).sendKeys("Doshi");
        driver.findElement(By.id("email")).sendKeys("meghakd@hotmail.com");

        driver.findElement(By.id("passwd")).sendKeys("bakgun");
        driver.findElement(By.id("firstname")).sendKeys("Rhys");
        driver.findElement(By.id("lastname")).sendKeys("Doshi");
        driver.findElement(By.id("address1")).sendKeys("12 The Parade");
        driver.findElement(By.id("address1")).sendKeys("London");
        driver.findElement(By.id("postcode")).sendKeys("WD195Bl");
        driver.findElement(By.id("phone_mobile")).sendKeys("0734567398");
        driver.findElement(By.id("alias")).sendKeys("Myaddress");
        driver.findElement(By.id("submitAccount")).click();

        String expectedmessage = "There are 4 errors";

        String actualmessage = driver.findElement(By.xpath(".//*[@id='center_column']/div/p")).getText();

        System.out.println(driver.findElement(By.xpath(".//*[@id='center_column']/div/p")).getText());

        if (expectedmessage.equals(actualmessage)) {
            System.out.print("Your test is pass");
        } else {
            System.out.print("Your test is fail");
        }

        driver.close();


    }

    }
