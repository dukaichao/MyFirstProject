package cn.dkc.leetcode.Arrays;

import java.lang.reflect.Array;

/*
  	����һ������ nums����дһ������������ 0 �ƶ��������ĩβ��ͬʱ���ַ���Ԫ�ص����˳��
	
	ʾ��:
	
	����: [0,1,0,3,12]
	���: [1,3,12,0,0]
	˵��:
	
	������ԭ�����ϲ��������ܿ�����������顣
	�������ٲ���������
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
