package cn.dkc.leetcode.Arrays;

import java.util.Scanner;

/*给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

说明：本题中，我们将空字符串定义为有效的回文串。

示例 1:

输入: "A man, a plan, a canal: Panama"
输出: true*/
public class isPalindrome {
	public boolean ispalindrome(String str) {
		String[] s = str.split(",");
		for(int i = 0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		int start = 0;
		int end = s.length - 1;
		while(start<=end) {
			if(s[start].equals(s[end])) {
				start++;
				end--;
			}
		}
		if(start>end)
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		System.out.println("请输入字符串:>");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		boolean b = new isPalindrome().ispalindrome(str);
		System.out.println(b);
	}
}
