package sort;

//选择排序
//Tested
public class SelectionSort {
	public int[] sort(int[] target) {
		int j = 0;
		int tmpValue = 0;
		int tmpIndex = 0;
		for (int i = 0; i < target.length; i++) {
			tmpIndex = i;
			for (j = i; j < target.length; j++) {
				if (target[tmpIndex] > target[j]) {
					tmpIndex = j;
				}
			}
			tmpValue = target[tmpIndex];
			target[tmpIndex] = target[i];
			target[i] = tmpValue;
		}
		return target;
	}
}
