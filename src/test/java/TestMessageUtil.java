package pkg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMessageUtil {
	String name="Mary";
	messageUtil messageUtil= new messageUtil(name);
	
	@Test
	public void testPrintMessage()
	{
		System.out.println("\nCall function testPrintMessage()");
		System.out.println("__________________________________");
		String actual = name;
		String expected =messageUtil.printMessage() ; 
		System.out.println("actual   defined here : "+ actual);
		System.out.println("expected from function: "+ expected);
		assertEquals( actual,expected   );
	}
	@Test
	public void testSalutationMessage()
	{
		System.out.println("\nCall function testSalutationMessage()");
		System.out.println("_______________________________________");
		String actual = "Hi! "+ name;
		String expected =messageUtil.salutationMessage() ; 
		System.out.println("actual   defined here : "+ actual);
		System.out.println("expected from function: "+ expected);
		assertEquals( actual,expected );
	}
	
			
}
