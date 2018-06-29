import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Google {
    static protected WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.findElement(By.name("firstName")).sendKeys("Sneha");
        driver.findElement(By.name("lastName")).sendKeys("Mehta");
        driver.findElement(By.name("Username")).sendKeys("SnehaMehta2222");
        driver.findElement(By.name("Passwd")).sendKeys("oxford0000");
        driver.findElement(By.name("ConfirmPasswd")).sendKeys("oxford0000");
        driver.findElement(By.xpath(".//*[@class='CwaK9']")).click();
        driver.findElement(By.id("phoneNumberId")).sendKeys("07538605455");
        driver.findElement(By.id("gradsIdvPhoneNext")).click();

        driver.findElement(By.id("headingText")).sendKeys("903839");
        driver.findElement(By.xpath(".//*[@id='gradsIdvVerifyNext']/content/span")).click();



        driver.findElement(By.id("phoneNumberId")).sendKeys("07538605455");
        driver.findElement(By.xpath(".//*[@class='Xb9hP']")).sendKeys("meghakd@hotmail.com");

        driver.findElement(By.name("password")).sendKeys("oxford0000");
        driver.findElement(By.xpath(".//*[@class='CwaK9']")).click();


        driver.findElement(By.id("headingText")).getText();





    }



}


