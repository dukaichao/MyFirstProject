package cn.dkc.leetcode.Arrays;
/*
	 删除排序数组中的重复项 II
	给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
	
	不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
	
	示例 1:
	
	给定 nums = [1,1,1,2,2,3],
	
	函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。
	
	你不需要考虑数组中超出新长度后面的元素。
*/
public class removeDuplicatesII {
	public int moveDuplicates(int[] nums) {
		 //表示i的增量
        int count = 0;
        //减去重复以后的长度
        int len = 0;
        //数组下标
        int k = 0;
        for(int i = 0;i<nums.length;i+=count){
            count = 1;
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j])
                    count++;  
            }
            //大于2统计多余的，然后把前两个赋给数组
            if(count>2){
                len += count - 2;
                int add = 2;
                while(add>0){
                    nums[k] = nums[i];
                    k++;
                    add--;
                }
            }
            //不大于2的话，将count个数的值赋给数组
            else{
                int add = count;
                while(add>0){
                    nums[k] = nums[i];
                    k++;
                    add--;
                }
            }
        }
        return nums.length - len;
    }
	
	public int moveDuplicates1(int[] nums) {
		int len = nums.length;
		if(len<2)
			return len;
		int i = 1;
		int k = i - 1;
		int j = i + 1;
//		0,0,1,1,1,1,2,3,3
		while( j <= len-1) {
            if( (nums[j] != nums[i]) || (nums[j] == nums[i] && nums[j] != nums[k]) ) {
                k = i;
                nums[i+1] = nums[j];
                i += 1;
            }
            j += 1;
		}
        return i + 1;
	}
	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,1,2,3,3};
		int len = new removeDuplicatesII().moveDuplicates1(arr);
		for(int i = 0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
