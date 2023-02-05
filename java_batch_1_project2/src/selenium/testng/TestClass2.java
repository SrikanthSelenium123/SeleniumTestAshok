package selenium.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestClass2 {

	static WebDriver d;

	@Test
	public void c() {

		d = new FirefoxDriver();
		d.get("https://www.google.com");
		System.out.println(d.getTitle());
		d.quit();
	}
	@Test
	public void b() {

		d = new FirefoxDriver();
		d.get("https://www.google.com");
		System.out.println(d.getTitle());
		d.quit();
	}

	@Test
	public void a() {

		d = new FirefoxDriver();
		d.get("https://www.google.com");
		System.out.println(d.getTitle());
		d.quit();
	}

}
