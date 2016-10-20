package search;
//二分查找
//Tested
public class BinarySearch {
	public static int search(int[] array, int start, int end, int target) {
		if (start != end) {
			int mid = (start + end) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] > target) {
				return search(array, start, mid - 1, target);
			} else
				return search(array, mid + 1, end, target);
		} else{
			return -1;
		}
			

	}
}
