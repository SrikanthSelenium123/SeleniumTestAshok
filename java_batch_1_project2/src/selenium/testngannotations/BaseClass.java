package selenium.testngannotations;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {

	static WebDriver d;

	@BeforeSuite
	public void bsuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void asuite() {
		System.out.println("After Suite");
	}

	@Parameters("browser")
	@BeforeTest
	public void btest(@Optional("chrome")  String browser) {
		System.out.println("Before test");
		if (browser.equalsIgnoreCase("chrome")) {
			d = new ChromeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			d.get("https://www.google.com");
		} else if (browser.equalsIgnoreCase("firefox")) {
			d = new FirefoxDriver();
			d.manage().window().maximize();
			d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			d.get("https://www.google.com");
		} else if (browser.equalsIgnoreCase("edge")) {
			d = new EdgeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			d.get("https://www.google.com");
		} else {
			System.err.println("Enter Valid browser");
		}
	}

	@AfterTest
	public void atest() {
		System.out.println("After test");
		d.quit();
	}

	@BeforeClass
	public void bclass() {
		System.out.println("Before class");
	}

	@AfterClass
	public void aclass() {
		System.out.println("After class");
	}

	@BeforeMethod
	public void bmeth(Method method) {
		System.out.println("Method started " + method.getName());
	}

	@AfterMethod
	public void ameth(Method method) {
		System.out.println("Method finished " + method.getName());
	}

}
