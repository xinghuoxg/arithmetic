package sort;
//冒泡排序
//Tested
public class BubbleSort {

	public int[] sort(int[] target) {
		int j=0;
		int tmp=0;
		for(int i=0;i<target.length-1;i++){
			for(j=0;j<target.length-1-i;j++){
				if(target[j]>target[j+1]){
					tmp = target[j];
					target[j] = target[j+1];
					target[j+1] = tmp;
				}
			}
		}
		return target;
	}
}
