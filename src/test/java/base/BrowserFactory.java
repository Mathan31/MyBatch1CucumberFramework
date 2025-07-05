package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	public WebDriver driver;
	public int iBrowserType = 1;
	
	public WebDriver browserInvoke() {
		if(driver == null) {
			switch (iBrowserType) {
			case 1:
				System.out.println("User option is : "+iBrowserType+", So invoking the Chrome browser.");
				driver = new ChromeDriver();
				break;
			case 2:
				System.out.println("User option is : "+iBrowserType+", So invoking the Edge browser.");
				driver = new EdgeDriver();
				break;
			case 3:
				System.out.println("User option is : "+iBrowserType+", So invoking the FireFox browser.");
				driver = new FirefoxDriver();
				break;
			case 4:
				System.out.println("User option is : "+iBrowserType+", So invoking the IE browser.");
				driver = new InternetExplorerDriver();
				break;
			default:
				System.out.println("User option is wrong: "+iBrowserType+", So invoking the default Chrome browser.");
				driver = new ChromeDriver();
				break;
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		return driver;
	}

}
