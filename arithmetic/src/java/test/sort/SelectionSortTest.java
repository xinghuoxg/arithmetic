package sort;

import java.util.Arrays;

import org.junit.Test;

public class SelectionSortTest {
	@Test
	public void insertSortTest(){
		SelectionSort bs= new SelectionSort();
		int[] testArray = {10,9,8,7,6,6,4,2,-1};
		System.out.print(Arrays.toString(bs.sort(testArray)));
	}
}
