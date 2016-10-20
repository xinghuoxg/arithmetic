package test;

import java.util.Arrays;

import org.junit.Test;

import search.BinarySearch;

public class BinarySearchTest {
	@Test
	public void test(){
		int[] sortedArray = {-1, 2, 4, 6, 6, 7, 8, 9, 10,11};
		int searchValue = 4;
		int index = -1;
		System.out.println(Arrays.toString(sortedArray));
		index  = BinarySearch.search(sortedArray, 0, sortedArray.length, searchValue);
		System.out.println(index);
	}
}
