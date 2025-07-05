package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	// Common Locators can be maintained here
	private AmazonHomePage amazonHome;
	private EbayHomePage ebayHome;
	private WebDriver driver;//123
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public AmazonHomePage getAmazonHome() {
		if(amazonHome == null) {
			amazonHome = new AmazonHomePage(driver);
		}
		return amazonHome;
	}

	public EbayHomePage getEbayHome() {
		if(ebayHome == null) {
			ebayHome = new EbayHomePage(driver);
		}
		return ebayHome;
	}

}
