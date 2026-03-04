package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Alert;

public class AlertsFast {

	public static void main(String[] args) {

		String text = "Raghav";

		// Chrome Options for faster loading
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER); // Faster than NORMAL
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-popup-blocking");

		WebDriver driver = new ChromeDriver(options);

		// Optional: reduce wait delays
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
		driver.manage().window().maximize();

		// Load website (faster due to EAGER strategy)
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Enter text
		driver.findElement(By.id("name")).sendKeys(text);

		// Click alert button
		driver.findElement(By.id("alertbtn")).click();

		// Handle alert
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

		
	}
}