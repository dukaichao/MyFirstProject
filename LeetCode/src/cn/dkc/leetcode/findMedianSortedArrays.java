package cn.dkc.leetcode;

/*����������СΪ m �� n ���������� nums1 �� nums2 ��

���ҳ������������������λ����Ҫ���㷨��ʱ�临�Ӷ�Ϊ O(log (m+n)) ��

����Լ��� nums1 �� nums2 ��ͬʱΪ�ա�*/
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
