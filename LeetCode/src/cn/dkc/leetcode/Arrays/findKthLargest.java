package cn.dkc.leetcode.Arrays;
//��δ������������ҵ��� k ������Ԫ�ء�
//��ע�⣬����Ҫ�ҵ������������ĵ� k ������Ԫ�أ������ǵ� k ����ͬ��Ԫ�ء�

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
