package cn.dkc.leetcode.Arrays;

import java.util.HashMap;
import java.util.Map;

/*����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�

��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�

ʾ�� 1:

�������� nums = [1,1,2], 

����Ӧ�÷����µĳ��� 2, ����ԭ���� nums ��ǰ����Ԫ�ر��޸�Ϊ 1, 2�� 

�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�*/
//���淽����map������  �����������˼  ����
public class removeDuplicates {
	//�����������ſ���
	public int moveduplicates(int[] arr) {
		int count = 0;
		//0,0,1,1,1,2,2,3,4,4,5}
		for(int i= 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					break;
				}
			}
		}
		int k = 1;
		int me = 0;
		for(int i = 0;i<arr.length-1;i+=me) {
			me = 1;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]!=arr[j]) {
					arr[k] = arr[j];
					k++;
					break;
				}
				else
					me++;
			}
		}
		return arr.length - count;
	}
	public static void main(String[] args) {
		int arr[] = {0,0,1,1,1,2,2,3,4,4,5};
		moveDuplicates(arr);
		System.out.println();
		int len = new removeDuplicates().moveduplicates(arr);
		for(int i = 0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void moveDuplicates(int[] arr) {
		int count = 0;
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		for(int i = 0;i<arr.length;i++) {
			if(!mp.containsKey(arr[i])) {
				mp.put(arr[i], count);
				for(int j = i+1;j<arr.length;j++) {
					if(mp.containsKey(arr[j])) {
						mp.put(arr[j],++count);
					}
				}
			}
		}
		for(Map.Entry<Integer, Integer> s:mp.entrySet()) {
			System.out.print(s.getKey()+" ");
		}
	}
}
