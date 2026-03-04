package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assignment {

    @Test
    public void fillForm() throws InterruptedException {

        // Launch Browser (Selenium Manager will auto-manage ChromeDriver)
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();

        // Enter Email
        driver.findElement(By.name("email"))
                .clear();
        driver.findElement(By.name("email"))
                .sendKeys("raghav.sunki@gmail.com");

        // Enter Password
        driver.findElement(By.id("exampleInputPassword1"))
                .clear();
        driver.findElement(By.id("exampleInputPassword1"))
                .sendKeys("punchh");

        // Click the checkbox (Check me out if you Love IceCreams!)
        driver.findElement(By.id("exampleCheck1")).click();

        // Select Employment Status as Employed (Radio Button)
        driver.findElement(By.id("inlineRadio2")).click();

        // Select Date of Birth
        WebElement dob = driver.findElement(By.name("bday"));
        dob.clear();
        dob.sendKeys("04/19/1994");

        // Click Submit Button
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        // Optional wait to see result
        Thread.sleep(3000);

        // Close browser
       
    }
}