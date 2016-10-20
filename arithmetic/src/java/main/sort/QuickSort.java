package sort;

//Tested
public class QuickSort {
	public int[] sort(int[] target, int left, int right) {
		int length = right - left + 1;
		int[] tmp = new int[length];
		int leftIndex = 0;
		int rightIndex = length - 1;
		if (length > 1) {
			for (int i = 0; i < length; i++) {
				if (target[i] < target[left]) {
					tmp[leftIndex] = target[i];
					leftIndex++;
				} else {
					tmp[rightIndex] = target[i];
					rightIndex--;
				}
			}
			leftIndex--;
			rightIndex++;

			int k = left;
			for (int i = 0; i < length; i++) {
				target[k] = tmp[i];
				k++;
			}
			if (leftIndex < 0) {
				target = sort(target, left + 1, right);
			} else if (leftIndex > length - 3) {
				target = sort(target, left, right - 1);
			} else {
				target = sort(target, left, left + leftIndex);
				target = sort(target, right - leftIndex + 2, right);
			}
		}
		return target;

	}

	public static int partion(int[] array, int l, int r) {
		int x = array[l];
		int left = l;
		int right = r;
		while (left < right) {
			while (left < right && array[right] >= x) {
				right--;
			}
			if (left < right) {
				array[left] = array[right];
				left++;
			}
			while (left < right && array[left] < x) {
				left++;
			}
			if (left < right) {
				array[right] = array[left];
				right--;
			}
		}
		array[left] = x;
		return left;
	}

	public static void quick_sort1(int s[], int l, int r) {
		if (l < r) {
			int i = partion(s, l, r);// 先成挖坑填数法调整s[]
			quick_sort1(s, l, i - 1); // 递归调用
			quick_sort1(s, i + 1, r);
		}
	}

}
