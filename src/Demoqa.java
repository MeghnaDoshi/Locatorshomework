import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demoqa {
    static protected WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://demoqa.com/registration/");
        driver.findElement(By.id("name_3_firstname")).sendKeys("Rupal");
        driver.findElement(By.id("name_3_lastname")).sendKeys("Gupta");
        driver.findElement(By.name("radio_4[]")).click();
        driver.findElement(By.name("checkbox_5[]")).click();
        driver.findElement(By.name("dropdown_7")).click();
        driver.findElement(By.name("phone_9")).sendKeys("0756453423");
        driver.findElement(By.id("username")).sendKeys("Rupalgupta123");
        driver.findElement(By.id("email_1")).sendKeys("rupalgupta23@gmail.com");
        driver.findElement(By.name("description")).sendKeys("Hello I am Rupal Gupta. I love dancing and I live in Croydon");
        driver.findElement(By.name("password")).sendKeys("daffodil");
        driver.findElement(By.id("confirm_password_password_2")).sendKeys("daffodil");
        driver.findElement(By.name("pie_submit")).click();

        String expectedmessage = "Username already exists";
        String actualmessage = driver.findElement(By.xpath(".//*[@class='entry-content']")).getText();

        if
                (expectedmessage.equals(actualmessage))
        { System.out.print("Your Test case is pass");}

        else
        { System.out.print("Your Test case is Fail");}
        driver.close();


    }














}
