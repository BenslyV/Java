package SeleniumRecap.SeleniumRecap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManager {

	public static void main(String[] args) {
		/*// Chrome
		WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();*/

		/*//Edge
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();*/
		
		/*//Firefox
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();*/
		
		/*//ie
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();*/
		
		//Opera
		
		WebDriverManager.operadriver().setup();
		WebDriver driver = new OperaDriver();
		
		driver.get("https://toolsqa.com");

		// quit the browser
		driver.quit();

	}

}
