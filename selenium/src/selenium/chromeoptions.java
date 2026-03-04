package selenium;


	import java.util.HashMap;

	import java.util.Map;



	import org.openqa.selenium.Proxy;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;

	import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;



	public class chromeoptions {



	public static void main(String[] args) {

	// TODO Auto-generated method stub
		

	ChromeOptions options = new ChromeOptions();

	Proxy proxy = new Proxy();

	proxy.setHttpProxy("ipaddress:4444");

	options.setCapability("proxy", proxy);

	Map<String, Object> prefs = new HashMap<String, Object>();



	prefs.put("download.default_directory", "/directory/path");



	options.setExperimentalOption("prefs", prefs);

	//FirefoxOptions options1 = new FirefoxOptions();

	//raj.setAcceptInsecureCerts(true);

	//EdgeOptions options2 = new EdgeOptions();

	options.setAcceptInsecureCerts(true);

	WebDriver driver = new ChromeDriver();

	WebDriver driver1 = new ChromeDriver(options);

	driver1.get("https://expired.badssl.com/");

	System.out.println(driver1.getTitle());



	}



	}

