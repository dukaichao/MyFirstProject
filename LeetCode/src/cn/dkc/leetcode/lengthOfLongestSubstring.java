package cn.dkc.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*����: "abcabcbb"
���: 3 
����: ���ظ��ַ�����Ӵ��� "abc"���䳤��Ϊ 3��*/
public class lengthOfLongestSubstring {
	public static void main(String[] args) {
		String st = " ";
		System.out.println("�Ӵ����ظ�����Ϊ��"+lengthoflongestsubstring(st));
	}
	
	public static int lengthoflongestsubstring(String s) {
		int max = 0 ;
		char[] buff = s.toCharArray();
		List<Integer> l = new ArrayList<Integer>();
		for(int i = 0;i<buff.length;i++) {
			Map<Character,Integer> mp  = new HashMap<Character,Integer>();
			mp.put(buff[i], i);
			for(int j = i;j<buff.length-1;j++) {
				if(!mp.containsKey(buff[j+1])) {
					mp.put(buff[j+1], j);
				}else {
					break;
				}
			}
			l.add(mp.size());
		}
		for(int i:l) {
			if(max<i) {
				max =i;
			}
		}
		return max;
	}	
}
	
