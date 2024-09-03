package com.jb.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class ShapesTest {
	Shapes shape=new Shapes();
	@Test
	void testAreaofSquare() 
	{
//		Shapes shapeSquareArea=new Shapes();
		assertEquals(576, shape.areaOfSqure(24), "Area of Square Calculation is Wrong"); //24*23
	}
	@Test
	void testAreaofCircle() 
	{
//		Shapes shapeCircleArea=new Shapes();
		assertEquals(314, shape.areaOfCircle(10), "Area of Circle Calculation is Wrong");//3.14*10*10 // message will be displayed only if the testcase is failed
	}
	
}