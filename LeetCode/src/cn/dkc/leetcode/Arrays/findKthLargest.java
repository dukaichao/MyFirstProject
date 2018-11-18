package cn.dkc.leetcode.Arrays;
//在未排序的数组中找到第 k 个最大的元素。
//请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。

public class findKthLargest {
	public int findKthlargest(int[] arr,int k) {
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr[arr.length - k];
	}
	public static void main(String[] args) {
		int arr[] = {2,5,4,1,3,0,0,0,0};
		int KthLargest = new findKthLargest().findKthlargest(arr, 2);
		System.out.println(KthLargest);
		
		
	}
}
