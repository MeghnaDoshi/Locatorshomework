import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Phptravels {
    static protected WebDriver driver;


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get ("https://www.phptravels.net/register");
        driver.findElement(By.name("firstname")).sendKeys("Prina");
        driver.findElement(By.name("lastname")).sendKeys("Gada");
        driver.findElement(By.name("phone")).sendKeys("07898756346");
        driver.findElement(By.name("email")).sendKeys("prinagada@gmail.com");
        driver.findElement(By.name("password")).sendKeys("netball");
        driver.findElement(By.name("confirmpassword")).sendKeys("netball");
        driver.findElement(By.xpath(".//*[@type='submit']")).click();

        String actualmessage = driver.findElement(By.xpath(".//*[@id='preloader']")).getText();
        String expectedmessage = "Hi Prina Gada";


        if
                (expectedmessage.equals(actualmessage))
        { System.out.print("Your Test case is pass");}

        else
        { System.out.print("Your Test case is Fail");}




    }






}
