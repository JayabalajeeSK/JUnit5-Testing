package com.jb.learning;
import static org.junit.Assert.*;
import org.junit.Test;
public class CalcTest {
	@Test
	public void test() {
		Calc c=new Calc();
		int actualResult=c.divide(10, 5); //actualResult=2;
		int exceptedResult=2; 
		assertEquals(exceptedResult, actualResult); //Excepted result, actual result; assert - check the state
	}
}
