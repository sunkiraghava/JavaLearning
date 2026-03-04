package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;


public class FlightSearchAutomation {

    public static void main(String[] args) throws InterruptedException {

        // Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Open the URL
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // 1. Select One Way toggle (already selected but ensuring)
        WebElement oneWay = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
        if (!oneWay.isSelected()) {
            oneWay.click();
        }

        // 2. Handle Suggestive Country Dropdown (Type "ind" and select India)
        WebElement countryDropdown = driver.findElement(By.id("autosuggest"));
        countryDropdown.sendKeys("ind");
        Thread.sleep(2000); // wait for suggestions

        // Click India from suggestion list
        driver.findElement(By.xpath("//a[text()='India']")).click();

        // 3. Keep FROM as Bengaluru (Already selected in UI - no change)
        // If needed, this is how to handle static dropdown
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();


        // 4. Keep TO as Chennai
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
                driver.findElement(By.xpath("//a[@value='MAA']")).click();

        // 5. Depart Date (keeping as default from screenshot - no action needed)
        // If needed to reselect:
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        driver.findElement(By.id("divpaxinfo")).click();

     // Loop to increase adults to 5
     for(int i = 1; i < 5; i++)
     {
         driver.findElement(By.id("hrefIncAdt")).click();
     }

     // Click Done button
     driver.findElement(By.id("btnclosepaxoption")).click();
    

        // 7. Select Senior Citizen checkbox
        WebElement seniorCitizen = driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount"));
        if (!seniorCitizen.isSelected()) {
            seniorCitizen.click();
        }

        // 8. Click Search Button
        WebElement searchButton = driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
        searchButton.click();

        // Wait to observe result
        Thread.sleep(5000);

        // Close browser
        driver.quit();
    }
}