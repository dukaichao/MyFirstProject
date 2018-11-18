package cn.dkc.leetcode.Arrays;
/*����һ������ nums ��һ��ֵ val������Ҫԭ���Ƴ�������ֵ���� val ��Ԫ�أ������Ƴ���������³��ȡ�

��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�

Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�

ʾ�� 1:

���� nums = [3,2,2,3], val = 3,

����Ӧ�÷����µĳ��� 2, ���� nums �е�ǰ����Ԫ�ؾ�Ϊ 2��

�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�*/
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
