package exampleforSuite;

import org.testng.annotations.Test;

public class Practice2 
{
	@Test(groups="smoke")
	public void sample3()
	{
		System.out.println("Sample 3");
	}
	
	@Test(groups="regression")
	public void sample4()
	{
		System.out.println("Sample 4");
	}
}
