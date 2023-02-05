package selenium.testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGHardAssertions {

	static WebDriver d;

	@Test
	public void test() {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com");
		String title = d.getTitle();
		assertEquals(title, "Google", "Title not Matched");
		assertTrue(false);
		d.quit();
	}

}
