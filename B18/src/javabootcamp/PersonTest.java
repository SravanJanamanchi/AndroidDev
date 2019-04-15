 package javabootcamp;

import org.junit.Test;

public class PersonTest {
	
	@Test
	
	public void shouldReturnHelloWorld() {
		Person marcus = new Person();
		assertEquals("Hello World",marcus.helloWorld());
	}

	private void assertEquals(String string, Object helloWorld) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
