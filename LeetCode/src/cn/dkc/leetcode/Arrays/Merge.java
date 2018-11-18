package cn.dkc.leetcode.Arrays;
/*�������������������� nums1 �� nums2���� nums2 �ϲ��� nums1 �У�ʹ�� num1 ��Ϊһ���������顣

˵��:

��ʼ�� nums1 �� nums2 ��Ԫ�������ֱ�Ϊ m �� n��
����Լ��� nums1 ���㹻�Ŀռ䣨�ռ��С���ڻ���� m + n�������� nums2 �е�Ԫ�ء�
ʾ��:

����:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

���: [1,2,2,3,5,6]*/
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
