package com.jb.junit;
import java.util.Arrays;
public class SortingArray2 
{
	public int[] sortingArray(int[] array)
	{
		for(int i=0;i<10000000;i++)
		{
			Arrays.sort(array);
		}
		return array;
	}
}
