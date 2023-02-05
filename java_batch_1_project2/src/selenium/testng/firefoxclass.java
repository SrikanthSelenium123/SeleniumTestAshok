package selenium.testng;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

public class firefoxclass extends GridClass {

	@Test
	public void testfirefox() throws MalformedURLException, Exception {
		setUp("firefox");
		d.get("https://www.google.com");
		System.out.println(d.getTitle());
		Thread.sleep(10000);

	}

}
