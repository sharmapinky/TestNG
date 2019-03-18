package FeaturesInTestNG;

import org.testng.annotations.Test;

public class Priority {

		int x=100,y=10,z;
		
@Test(priority=1)
public void sum(){
	System.out.println(x+y);
}
@Test(priority=2)
public void subtraction(){
	System.out.println(x-y);
	}
@Test(priority=3)
public void multiplication(){
	System.out.println(x*y);
}
@Test(priority=4)
public void division(){
	System.out.println(x/y);
}

}
