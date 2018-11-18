package cn.dkc.leetcode;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

//����һ���ַ��� s���ҵ� s ����Ļ����Ӵ�������Լ��� s ����󳤶�Ϊ1000��

public class longestPalindrome {
	public static void main(String[] args) {
		System.out.println("�����ַ�����");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(longestPalindromes(str));

	}
	//��ȡ��������ʱ�临�Ӷ�ΪO��n3��
	public static String longestPalindromes(String s) {
        if(s.equals(""))
            return "";
        List<String> l = new ArrayList<String>();
        //����whileѭ������
        int k = 0;
        //ʹ��ȡ���ַ������ȴ�1-s.length()
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
	//�жϻ���
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
