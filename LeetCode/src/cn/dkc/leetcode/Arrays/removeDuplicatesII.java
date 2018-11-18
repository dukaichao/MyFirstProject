package cn.dkc.leetcode.Arrays;
/*
	 ɾ�����������е��ظ��� II
	����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ�����������Σ������Ƴ���������³��ȡ�
	
	��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
	
	ʾ�� 1:
	
	���� nums = [1,1,1,2,2,3],
	
	����Ӧ�����³��� length = 5, ����ԭ�����ǰ���Ԫ�ر��޸�Ϊ 1, 1, 2, 2, 3 ��
	
	�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
*/
public class removeDuplicatesII {
	public int moveDuplicates(int[] nums) {
		 //��ʾi������
        int count = 0;
        //��ȥ�ظ��Ժ�ĳ���
        int len = 0;
        //�����±�
        int k = 0;
        for(int i = 0;i<nums.length;i+=count){
            count = 1;
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j])
                    count++;  
            }
            //����2ͳ�ƶ���ģ�Ȼ���ǰ������������
            if(count>2){
                len += count - 2;
                int add = 2;
                while(add>0){
                    nums[k] = nums[i];
                    k++;
                    add--;
                }
            }
            //������2�Ļ�����count������ֵ��������
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
