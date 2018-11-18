package cn.dkc.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*输入: "abcabcbb"
输出: 3 
解释: 无重复字符的最长子串是 "abc"，其长度为 3。*/
public class lengthOfLongestSubstring {
	public static void main(String[] args) {
		String st = " ";
		System.out.println("子串不重复长度为："+lengthoflongestsubstring(st));
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
	
