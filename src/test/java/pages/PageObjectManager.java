package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	private WebDriver driver;
	private EbayHome ebayHome;
	private AmazonHome amazonHome;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public EbayHome getEbayPage() {
		if(ebayHome == null) {
			ebayHome = new EbayHome(driver);
		}else {
			return ebayHome;
		}
		return ebayHome;
	}
	
	public AmazonHome getAmazonPage() {
		if(amazonHome == null) {
			amazonHome = new AmazonHome(driver);
		}else {
			return amazonHome;
		}
		return amazonHome;
	}

}
