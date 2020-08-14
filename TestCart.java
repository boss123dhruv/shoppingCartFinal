package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCart {

	@Test
	public void testBad(){
		Product p = new Product("Shirt", 30);
		Cart c = new Cart();
		c.addProduct(p);
		int pass = c.getCartSize();
		boolean result = true;
		assertEquals(result,3);
	}
	public void testGood(){
		
	}

}
