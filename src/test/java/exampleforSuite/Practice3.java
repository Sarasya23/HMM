package exampleforSuite;

import org.testng.annotations.Test;

public class Practice3 
{
	@Test(groups="smoke")
	public void sample5()
	{
		System.out.println("Sample 5");
	}
	
	@Test(groups="regression")
	public void sample6()
	{
		System.out.println("Sample 6");
	}
}
