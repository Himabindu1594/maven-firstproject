import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class HelloWorldTestCase{
	
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
	public void testHelloWorld()
	{
		
		String actual = hw.withHiMessage("Krithik");
		String expected = "Hi Krithik";
		
		assertEquals(actual,expected);
	}
	
	@Test
	public void testArray()
	{
		
		String inputArray[] = {"raj","raj","kumar","ganesh"};
		String expecteds[] = {"raj","kumar","ganesh"};
		String actuals[] = hw.removeDuplicates(inputArray);
		assertArrayEquals(expecteds, actuals);
	}
	
	//@Test
	public void testArray2()
	{
		
		String inputArray[] = {"raj","raj","rohith","ganesh"};
		String expecteds[] = {"raj","rohith","ganesh"};
		String actuals[] = hw.removeDuplicates(inputArray);
		assertArrayEquals(expecteds, actuals);
	}
	
	
	
	

}
