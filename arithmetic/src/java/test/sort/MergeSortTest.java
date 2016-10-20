package sort;

import java.util.Arrays;

import org.junit.Test;


public class MergeSortTest{
	@Test
	public void insertSortTest(){
		int[] testArray = {10,9,8,7,6,6,4,2,-1};
		System.out.print(Arrays.toString(testArray));
		MergeSort.sort(testArray);
		System.out.print(Arrays.toString(testArray));
	}
}
