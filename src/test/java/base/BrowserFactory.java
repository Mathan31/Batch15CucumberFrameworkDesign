package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	public WebDriver driver;
	public int browserType = 1; //1 - Chrome,2 - FF,3 - Edge,4 - IE
	
	public WebDriver browserInvoke() {
		if(driver==null) {
			switch (browserType) { 
			case 1:
				System.out.println("User option is : "+browserType+",So invoking Chrome browser");
				driver = new ChromeDriver();
				break;
			case 2:
				System.out.println("User option is : "+browserType+",So invoking Firefox browser");
				driver = new FirefoxDriver();
				break;
			case 3:
				System.out.println("User option is : "+browserType+",So invoking Edge browser");
				driver = new EdgeDriver();
				break;
			case 4:
				System.out.println("User option is : "+browserType+",So invoking IE browser");
				driver = new InternetExplorerDriver();
				break;

			default:
				System.out.println("User option is wrong: "+browserType+",So invoking the default Chrome browser");
				driver = new ChromeDriver();
				break;
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		
		return driver;
	}
	

}
