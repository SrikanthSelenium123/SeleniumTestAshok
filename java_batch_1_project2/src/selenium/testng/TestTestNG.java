package selenium.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTestNG {
	
	static WebDriver d;
	
	@Test
	public void test()
	{
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.get("https://www.google.com");
		System.out.println(d.getTitle());
	}

}
