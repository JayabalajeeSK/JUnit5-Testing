package com.jb.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class TestTrail {
	@Test
	void test() {
		assertEquals(4, 4);
	}
//	@Test
//	void testAreaOFSquare()
//	{
//		Shapes shape=new Shapes();
//		assertEquals(64, shape.areaOfSqure(8), ()->"Area of Square Calculation is Wrong"); // we can print message using supplier-> functional interface(we can use in lambda interface - java's functional interface
//	}
}