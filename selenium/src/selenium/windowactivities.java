package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowactivities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
	
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.navigate().to("https://google.com");

//WebDriver driver = new FirefoxDriver();
//WebDriver driver = new EdgeDriver();


driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys("raghav");
driver.findElement(By.name("inputPassword")).sendKeys("priya");
driver.findElement(By.className("signInBtn")).click();
driver.findElement(By.cssSelector("p.error")).getText();
//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

driver.findElement(By.linkText("Forgot your password?")).click();
Thread.sleep(1000);//
driver.findElement(By.xpath("//input[@placeholder='Name'] ")).sendKeys("raju");

driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("raju.sr@gmail.com");
driver.findElement(By.cssSelector(" input[placeholder='Phone Number']")).sendKeys("9999999999");
driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
System.out.println(driver.findElement(By.cssSelector("form p")).getText());
driver.findElement(By.cssSelector(".go-to-login-btn")).click();
Thread.sleep(1000);


driver.findElement(By.cssSelector("#inputUsername")).sendKeys("raghav");
driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
driver.findElement(By.cssSelector("#chkboxOne")).click();
//driver.findElement(By.cssSelector("#chkboxTwo")).click();
driver.findElement(By.cssSelector("button[type='submit']")).click();


	}
	

}
