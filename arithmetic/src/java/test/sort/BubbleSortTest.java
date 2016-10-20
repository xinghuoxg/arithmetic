package sort;
import java.util.Arrays;

import org.junit.Test;

import sort.BubbleSort;

public class BubbleSortTest {
	@Test
	public void bullSortTest() {
		BubbleSort bs= new BubbleSort();
		int[] testArray = {10,9,8,7,6,6,4,2,-1};
		System.out.print(Arrays.toString(bs.sort(testArray)));
	}
}
