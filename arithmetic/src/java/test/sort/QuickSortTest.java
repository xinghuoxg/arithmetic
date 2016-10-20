package sort;

import java.util.Arrays;

import org.junit.Test;

public class QuickSortTest {
	@Test
	public void test(){
		int[] testArray = {10,9,8,7,6,6,4,2,-1};
		System.out.println(Arrays.toString(testArray));
		QuickSort.quick_sort1(testArray, 0, testArray.length-1);
		System.out.println(Arrays.toString(testArray));
	}
}
