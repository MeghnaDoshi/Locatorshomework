import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

public class Nopcommerce {
    static protected WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get ("http://demo.nopcommerce.com/");
        driver.findElement(By.linkText( "Register")).click ();
        driver.findElement(By.id("gender-female")).click ();
        driver.findElement(By.name("FirstName")).sendKeys( "Meghna");
        driver.findElement(By.name("LastName")). sendKeys("Doshi");
        driver.findElement(By.id ("Email")).sendKeys("meghakd@hotmail.com");
        driver.findElement(By.name("Company")).sendKeys("DoshiLtd");
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.id("Password")).sendKeys("london");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("london");
        driver.findElement(By.name ("register-button")).click();

        String actualmessage = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div/ul/li")).getText();
        String expectedmessage="The specified email already exists";

        if (expectedmessage.equals(actualmessage))

        {
            System.out.print("Your Test case passed");}
        else
        {
            System.out.print("Your Test case failed");}






    }
}




