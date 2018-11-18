package cn.dkc.leetcode.Arrays;

import java.lang.reflect.Array;

/*
  	给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
	
	示例:
	
	输入: [0,1,0,3,12]
	输出: [1,3,12,0,0]
	说明:
	
	必须在原数组上操作，不能拷贝额外的数组。
	尽量减少操作次数。
*/
public class moveZeroes {
	public static void main(String[] args) {
		int[] arr = {0,1,0,3,12,0,2,5};
		for(int i = 0;i<arr.length-1;i++) {
			if(arr[i]==0&&arr[i+1]!=0) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}else if(arr[i]==0&&arr[i+1]==0) {
				for(int j = i+1;j<arr.length;j++) {
					if(arr[i]!=arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						break;
					}
				}
			}
		}
		for(int i:arr)
			System.out.print(i+" ");
	}
}
