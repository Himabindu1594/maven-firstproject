import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelloNumbersTestCase {
	
	static HelloWorld hw;
	@BeforeClass
	public static void beforeClasses()
	{
		hw = new HelloWorld();
		System.out.println("It is called befor all the test cases only once. ");
		
	}
	@Before
	public void beforeMessage()
	{
		
		System.out.println("Before");
	}
	@Test
	public void testNumbers() 
	{
		boolean actual=hw.checkNumbers(4,4);
		boolean expecteds;
		
		assertTrue(actual);
		
		
	}
	
	@Test
	public void testNumbers2() 
	{
		boolean actual=hw.checkNumbers(4,3);
		boolean expecteds;
		
		assertFalse(actual);
		
		
	}

}
