package com.jb.junit;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;
class SortingArrayTest2 {
	@Test
	void test() {
		SortingArray array=new SortingArray();
		int[] unsorted = {30,10,20,02}; 
		assertTimeout(Duration.ofMillis(1), ()-> array.sortingArray(unsorted)); //to complete that unit task in 1ms
		//if it failed then we consider that unit cant perform task in 1ms
		//op: Test case Passed
	}
}