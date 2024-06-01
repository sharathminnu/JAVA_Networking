import java.util.Arrays;

public class TWOSum {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[] arr , int target){
        int r = 0;
        int l = arr.length - 1;

        while (r<l){
            if(r+l == target){
                return new int[] {r,l};
            }
            if(r+l< target){
                l--;
            }else {
                r++;
            }
        }
        return new int[] {-1,-1};
    }
}
