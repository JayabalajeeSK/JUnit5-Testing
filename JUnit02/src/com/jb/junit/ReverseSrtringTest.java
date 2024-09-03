package com.jb.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class ReverseSrtringTest {
	@Test
	public void test() {
		ReverseSrtring reverse= new ReverseSrtring();
//		String actualResult = reverse.reverseString("Jayabalajee");
		String expectedResult = "eejalabayaJ";
//		assertEquals(expectedResult, actualResult);
		assertEquals(expectedResult, reverse.reverseString("Jayabalajee"));
	}
}
