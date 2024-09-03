package com.jb.junit;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
class ArraysTesting {
	@Test
	void testArrays() 
	{
		int [] exceptedArray= {2,4,6,8};
		int [] actualArray= {4,8,6,2}; 
		Arrays.sort(actualArray);//2,4,6,8
//		assertArrayEquals(exceptedArray, actualArray);
		assertEquals(exceptedArray, actualArray); ///testcase failed // it check reference variable
	}
}