package FeaturesInTestNG;

import org.testng.annotations.Test;

public class InvocationCount {


@Test(invocationCount=10)
public void sum(){
	int x=10;
	int y=20;
	System.out.println(x+y);
}
@Test(invocationCount=20)
public void subtraction(){
	int x=100;
	int y=20;
	System.out.println(100-20);
}
	}


