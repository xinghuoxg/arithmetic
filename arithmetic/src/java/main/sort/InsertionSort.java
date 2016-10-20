package sort;

//插入排序
//Tested
public class InsertionSort {
	public int[] sort(int[] target) {
		int j = 0;
		int tmp = 0;
		for (int i = 1; i < target.length; i++) {
			tmp = target[i];
			for (j = i - 1; j >= 0; j--) {
				if (tmp < target[j]) {
					target[j + 1] = target[j];
				} else {
					break;
				}
			}
			target[j + 1] = tmp;
		}
		return target;
	}
}
