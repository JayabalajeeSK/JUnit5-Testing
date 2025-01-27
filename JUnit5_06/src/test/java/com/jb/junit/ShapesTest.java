package com.jb.junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // to avoid creating instance for each test methods
class ShapesTestBeforeAfter 
{
	ShapesTestBeforeAfter()
	{
		System.out.println("Test Object is Created Before the Test Methods");
	}
	@BeforeAll //for static method - independent on the instance, not depend upon object
	void beforeAll()
	{
		System.out.println("Before All test");
	}
	
	@BeforeEach
	void init()
	{
	     shape = new Shapes();
	     System.out.println("Before Test");
	}
	Shapes shape;
	@Test
	void testAreaofSquare() 
	{
		assertEquals(576, shape.areaOfSqure(24), "Area of Square Calculation is Wrong"); //24*23
		System.out.println("Actual Test Running");
	}
	@Test
	void testAreaofCircle() 
	{
		assertEquals(314, shape.areaOfCircle(10), "Area of Circle Calculation is Wrong");//3.14*10*10 // message will be displayed only if the testcase is failed
		System.out.println("Actual Test Running");
	}
	
	@AfterEach 
	void destroy()
	{
		System.out.println("After All test cases clean up");
	}
	@AfterAll
	void AfterAlldestroy()
	{
		System.out.println("After All test cases clean up Last Destory AfterALL");
	}
}
//after every test it call destroy() method
//op
//Test Object is Created Before the Test Methods
//Before All Test
//Before Test
//Actual Test Running
//After All test cases clean up
//Test Object is Created Before the Test Methods
//Before Test
//Actual Test Running
//After All test cases clean up
//After All test cases clean up Last Destory AfterALL
