

public class MaxArr {
    public static void main(String[] args) {
        int [] arr = {23,1,5,34,7,12,67,89,2,5,7,9,10};
        System.out.println(max_arr(arr));
    }

    static int max_arr(int[] arr) {
        int max = arr[0];

        for(int i=0; i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
}
