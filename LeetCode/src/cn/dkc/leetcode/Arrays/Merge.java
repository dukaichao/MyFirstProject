package cn.dkc.leetcode.Arrays;
/*给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

说明:

初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
示例:

输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

输出: [1,2,2,3,5,6]*/
public class Merge {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        int p = m;
        while(k<n){
            nums1[p] = nums2[k];
            p++;
            k++;
        }
        for(int i = 1;i<m+n;i++){
            for(int j = 0;j<m+n-i;j++){
                if(nums1[j]>nums1[j+1]){
                    int temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                }
            }
        }
        for(int i = 0;i<m+n;i++){
            System.out.print(nums1[i]+" ");
        }
    }
	public static void main(String[] args) {
		int[] arr1 = {1,3,5,7,9,2,4,6,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,};
		int[] arr2 = {2,5,6,1,3,2,4,5,0,0};
		new Merge().merge(arr1, 9, arr2, 8);
	}
}
