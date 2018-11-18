package cn.dkc.leetcode.Arrays;

import java.util.Scanner;

/*����һ���ַ�������֤���Ƿ��ǻ��Ĵ���ֻ������ĸ�������ַ������Ժ�����ĸ�Ĵ�Сд��

˵���������У����ǽ����ַ�������Ϊ��Ч�Ļ��Ĵ���

ʾ�� 1:

����: "A man, a plan, a canal: Panama"
���: true*/
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
		System.out.println("�������ַ���:>");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		boolean b = new isPalindrome().ispalindrome(str);
		System.out.println(b);
	}
}
