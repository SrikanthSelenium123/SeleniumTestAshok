package selenium.testng;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

public class chromeclass extends GridClass {

	@Test
	public void testchrome() throws MalformedURLException, Exception {
		setUp("chrome");
		d.get("https://www.google.com");
		System.out.println(d.getTitle());
		Thread.sleep(10000);

	}

}
