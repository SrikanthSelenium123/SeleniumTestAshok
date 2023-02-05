package selenium.testng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class GridClass {

	public WebDriver d;
	DesiredCapabilities cap;

	public void setUp(String browser) throws MalformedURLException {
		if (browser.equalsIgnoreCase("chrome")) {
			cap = new DesiredCapabilities();
			cap.setPlatform(Platform.ANY);
			cap.setBrowserName(browser);
		} else if (browser.equalsIgnoreCase("firefox")) {
			cap = new DesiredCapabilities();
			cap.setPlatform(Platform.ANY);
			cap.setBrowserName(browser);
		}
		d = new RemoteWebDriver(new URL("http://localhost:4444"), cap);
	}

	@AfterMethod
	public void atest() {
		d.quit();
	}

}
