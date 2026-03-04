package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class sumofallvaluesintable {

    public static void main(String[] args) {

        // 1) Set path to your ChromeDriver executable
      

        // 2) Launch Chrome Browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 3) Navigate to the automation practice page
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // 4) Locate the amount column values from the web table fixed header
        //    Here: the table has rows TR under a header, so we locate all TD in 4th column
        List<WebElement> amountCells = driver.findElements(
                By.xpath("//table[.//th[text()='Amount']]/tbody/tr/td[4]"));

        int sum = 0;

        System.out.println("---- Amount Column Values ----");

        // 5) Loop through webElements, print each and accumulate
        for (WebElement cell : amountCells) {
            String valueText = cell.getText().trim();
            System.out.println(valueText);

            // Convert the text into integer
            int value = Integer.parseInt(valueText);
            sum += value;
        }

        // 6) Print the sum of all amounts
        System.out.println("Sum of all amounts is: " + sum);

        // 7) Optional: close browser
        driver.quit();
    }
}