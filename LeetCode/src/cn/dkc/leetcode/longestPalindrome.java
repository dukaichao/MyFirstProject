package cn.dkc.leetcode;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。

public class longestPalindrome {
	public static void main(String[] args) {
		System.out.println("输入字符串：");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(longestPalindromes(str));

	}
	//采取暴力法，时间复杂度为O（n3）
	public static String longestPalindromes(String s) {
        if(s.equals(""))
            return "";
        List<String> l = new ArrayList<String>();
        //控制while循环次数
        int k = 0;
        //使截取的字符串长度从1-s.length()
        int count = 1;
        while(k<s.length()){
            for(int i = 0;i<s.length()-count+1;i++){
                String str = s.substring(i,i+count);
                if(is_Palindrome(str)){
                    l.add(str);
                }
            }
            k++;
            count++;
        }
       return l.get(l.size() - 1);
    }
	//判断回文
	public static boolean is_Palindrome(String str) {
		char[] buff = str.toCharArray();
		int end = buff.length-1;
		int start = 0;
		while(start<=end) {
			if(buff[start] == buff[end]) {
				start++;
				end--;
			}else break;
		}
		if(start>end)
			return true;
		else
			return false;
	}
}
