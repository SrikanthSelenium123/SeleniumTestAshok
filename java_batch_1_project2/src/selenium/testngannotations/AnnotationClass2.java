package selenium.testngannotations;

import org.testng.annotations.*;

public class AnnotationClass2 extends BaseClass{

	@Test
	public void test1() {
		System.out.println(d.getTitle());
	}

	@Test
	public void test2() {
		System.out.println(d.getCurrentUrl());
	}

	@Test
	public void test3() {
		System.out.println(d.getWindowHandle());
	}

}
