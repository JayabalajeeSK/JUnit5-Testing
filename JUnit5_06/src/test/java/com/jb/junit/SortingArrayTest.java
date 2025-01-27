package com.jb.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class SortingArrayTest {
	@Test
	void test() {
//		try {
		SortingArray array=new SortingArray();
//		int[] unsorted = {30,10,20,02};
		int[] unsorted = null; // if null, the array not execute it throws an exception
//		int[] sordedArray = array.sortingArray(unsorted);
//		for(int x: sordedArray)
//		{
//			System.out.println(x);
//		}
//		fail();//failing the testcase explicitly even though it is correct, testcase will fail, and code is executed
//		}
//		catch (Exception e) // here to say the test case is passed and that methods throws an exception (array can't accept null for sorting)
//		{
//			System.out.println("The Exception is "+ e); 
//		}
		assertThrows(NullPointerException.class, () -> array.sortingArray(unsorted)); 
		// if no null pointer exception - testcase failed and code(sorting) executed
		// if null pointer exception - testcase passed and code(sorting) is not executed
		// op: test case is passed, but code is not executed 
	}
}