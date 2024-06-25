
//https://leetcode.com/problems/find-the-duplicate-number/description/
public class FindDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,2};
        int res = findDuplicate(arr);
        System.out.println(res);

    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        int result = -1;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else {
                i++;
            }
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                //result.add(j+1);
                result = nums[j];

            }
        }
        return result;

    }

    static void swap(int [] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
