package sort;

import java.util.Arrays;

import org.junit.Test;

public class InsertSortTest  {
	@Test
	public void insertSortTest(){
		InsertionSort bs= new InsertionSort();
		int[] testArray = {10,9,8,7,6,6,4,2,-1};
		System.out.print(Arrays.toString(testArray));
		System.out.print(Arrays.toString(bs.sort(testArray)));
	}
}
