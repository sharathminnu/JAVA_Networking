import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

public class FindDuplecates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> res = findDuplicates(arr);
        System.out.println(res);

    }

    static void swap(int [] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int i=0;
        while(i< nums.length){
            int correct = nums[i] - 1;
            if(nums[i]!= nums[correct]){
                swap(nums,i,correct);
            }else {
                i++;
            }

        }

        for(int j=0;j< nums.length;j++){
            if(nums[j]!= j+1){
                result.add(nums[j]);
            }
        }
        return result;
    }
}
