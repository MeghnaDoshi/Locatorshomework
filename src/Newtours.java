import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Newtours {
    static protected WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get ("http://newtours.demoaut.com/mercuryregister.php?osCsid=649bc8cf2ce17ae2d091bce2b50775af");
        driver.findElement(By.name("firstName")).sendKeys("Nidhi");
        driver.findElement(By.name("lastName")).sendKeys("Agrawal");
        driver.findElement(By.name("phone")).sendKeys("00124323467");
        driver.findElement(By.id("userName")).sendKeys("nidhi.agrawal@hotmail.com");
        driver.findElement(By.name("address1")).sendKeys("123 lytham Avenue");
        driver.findElement(By.name("address2")).sendKeys("Southoxhey");
        driver.findElement(By.name("city")).sendKeys("Watford");
        driver.findElement(By.name("state")).sendKeys("Hertfordshire");
        driver.findElement(By.name("postalCode")).sendKeys("WD196XB");
        driver.findElement(By.id("email")).sendKeys("Nidhi123");
        driver.findElement(By.name("password")).sendKeys("london");
        driver.findElement(By.name("confirmPassword")).sendKeys("london");
        driver.findElement(By.name("register")).click();

        String actualmessage=driver .findElement (By.xpath(".//*[@href ='mercurysignon.php']")).getText();
        String expectedmessage = "Sign in";
        System.out.println(driver.findElement(By.xpath(".//*[@href ='mercurysignon.php']")).getText());


        if (expectedmessage.equals(actualmessage))

        { System.out.print("Your Test case passed");}

        else
        {
            System.out.print("Your Test case failed");}





    }
}




