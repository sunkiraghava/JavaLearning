package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class deletingcookies {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		//driver.manage().addCookie("asdf");
		
		driver.get("https://google.com");
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("user.home") + "/Desktop/google_screenshot.png");

        // Copy screenshot to destination
        Files.copy(src, dest);

        System.out.println("Screenshot saved on Desktop");

        // Close browser
        driver.quit();
		
	}

}
