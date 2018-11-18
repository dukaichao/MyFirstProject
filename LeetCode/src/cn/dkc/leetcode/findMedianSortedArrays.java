package cn.dkc.leetcode;

/*给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。

请找出这两个有序数组的中位数。要求算法的时间复杂度为 O(log (m+n)) 。

你可以假设 nums1 和 nums2 不同时为空。*/
public class findMedianSortedArrays {
	public static void main(String[] args) {
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {2,4,6,8,10,12};
		int[] arr = new int[arr1.length+arr2.length];
		for(int i = 0;i<arr.length;i++) {
			if(i<arr1.length) {
				arr[i] = arr1[i];
			}else {
				arr[i] = arr2[i-arr1.length];
			}
		}
		for(int i =1;i<arr.length;i++) {
			for(int j = 0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		int len = arr.length-1;
		int index = len/2;
		System.out.println(index);
		double mid = 0.0;
		if(len%2==0)
			mid = arr[index];
		
		else
			mid = (arr[index]+arr[index+1])/2.0;
		System.out.println(mid);
	}
}
