package cn.dkc.leetcode.Arrays;

public class twoSumII {
	public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = 0;
        for(;i<numbers.length-1;i++){
            int elements = target - numbers[i];
            for(j = i+1;j<numbers.length;j++){
                if(elements == numbers[j])
                   return new int[]{i+1,j+1};
            }
        }
        return new int[]{-1,-1};
    }
	public static void main(String[] args) {
		int[] array = {2,7,9,11};
		int[] arr = new twoSumII().twoSum(array, 9);
		for(int i:arr)
			System.out.print(i+" ");
	}
}
