package jsscriptexecutor;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSAlertClass {

	static WebDriver d;

	// @Test()
	public void webTableinChrome() throws Exception {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://en.wikipedia.org/wiki/Lok_Sabha");
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		JavascriptExecutor js = ((JavascriptExecutor) d);
		js.executeScript("alert('Hello')");
		Thread.sleep(5000);
		Alert alt = d.switchTo().alert();
		alt.accept();

	}

	@Test()
	public void webTableinChrome1() throws Exception {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://en.wikipedia.org/wiki/Lok_Sabha");
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		JavascriptExecutor js = ((JavascriptExecutor) d);
		Thread.sleep(5000);
		js.executeScript(
				"document.evaluate(\"//input[@name='search']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.value='Test'");
		// WebElement ele = d.findElement(By.xpath("//input[@name='search']"));
		// js.executeScript("arguments[0].value='Selenium'", ele);
		Thread.sleep(5000);
		// js.executeScript("document.getElementsByName('search')[0].value='Selenium'");
		String str = (String) js.executeScript("return document.getElementById('searchInput').value");
		System.out.println(str);
		d.findElement(By.xpath("//input[@placeholder='Search Wikipedia']")).click();
		Thread.sleep(5000);
		WebElement search = d.findElement(By.xpath("//button[text()='Search']"));

		js.executeScript("arguments[0].click();", search);

	}

}
