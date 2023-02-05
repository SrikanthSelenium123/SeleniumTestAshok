package selenium.testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGSoftAssertions {
	
	static WebDriver d;

	@Test
	public void test1() {
		SoftAssert sassert = new SoftAssert();
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com");
		String title = d.getTitle();
		boolean titlecheck = (title.equalsIgnoreCase("Google"))?true:false;
		sassert.assertTrue(titlecheck,"Not Matched !!");
		sassert.assertTrue(true); 
		sassert.assertTrue(false);
		sassert.assertTrue(true);
		sassert.assertTrue(true); 
		sassert.assertTrue(false);
		sassert.assertTrue(true);
		sassert.assertTrue(true); 
		sassert.assertTrue(false);
		sassert.assertTrue(true);
		d.quit();
		sassert.assertAll("Failed assertions reported !!");
	}
	
	@Test
	public void test2() {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com");
		String title = d.getTitle();
		boolean titlecheck = (title.equalsIgnoreCase("Google"))?true:false;
		Assert.assertTrue(titlecheck,"Not Matched !!");
		Assert.assertTrue(true); 
		Assert.assertTrue(false);
		Assert.assertTrue(true);
		Assert.assertTrue(true); 
		Assert.assertTrue(false);
		Assert.assertTrue(true);
		Assert.assertTrue(true); 
		Assert.assertTrue(false);
		Assert.assertTrue(true);
		
		d.quit();
		//sassert.assertAll("Failed assertions reported !!");
	}


}
