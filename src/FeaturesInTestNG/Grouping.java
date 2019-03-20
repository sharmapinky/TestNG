package FeaturesInTestNG;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups="maths")
	public void sum(){
		System.out.println(10+20);
	}
	@Test(groups="maths")
	public void subtraction(){
		System.out.println(20-10);
	}
	@Test(groups="maths",priority=1)
	public void multiplication(){
		System.out.println(10*20);
	}
	@Test(groups="maths")
	public void division(){
		System.out.println(20/2);
	}
	@Test(groups="String")
	public void stringConcat(){
		System.out.println("core"+"java");
	}

}
