package cn.dkc.leetcode.Arrays;
/*给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。

不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

示例 1:

给定 nums = [3,2,2,3], val = 3,

函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。

你不需要考虑数组中超出新长度后面的元素。*/
public class removeElement {
	public int moveElement(int[] nums, int val) {
        int len = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]==val&&nums[i+1]!=val){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }else if(nums[i] == val&&nums[i+1]==val){
                for(int j = i+1;j<nums.length;j++){
                    if(nums[i]!=nums[j]){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
         }
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == val)
                len++;
        }
        return nums.length-len;
    }
	public static void main(String[] args) {
		int[] nums = {3,2,2,3};
		int len = new removeElement().moveElement(nums, 3);
		for(int i = 0;i<len;i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
