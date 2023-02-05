package selenium.testngannotations;

import org.testng.annotations.*;

public class AnnotationClass1 extends BaseClass{

	@Test(enabled = true)
	public void test1() {
		System.out.println(d.getTitle());
	}

	@Test(enabled = true)
	public void test2() {
		System.out.println(d.getCurrentUrl());
	}

	@Test(enabled = false)
	public void test3() {
		System.out.println(d.getWindowHandle());
	}

}
