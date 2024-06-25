import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {5,1,1,2,0,0};
        //bubble_sort(arr);
        selection_sort(arr);
        //insertion_sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static  void swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int getMax(int [] arr,int start,int last){
        int max = start;
        for(int i=start;i<= last;i++){
            if(arr[max] < arr[i] ){
                max =i;
            }

        }
        return max;
    }


    static void selection_sort(int[] arr){
            for(int i=0;i< arr.length;i++){
                int last = arr.length-i-1;
                int max = getMax(arr,0,last);
                swap(arr,max,last);
            }
    }

    static void insertion_sort(int[]arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }

    static void bubble_sort(int[] arr){
        boolean swaped;
        for(int i=0;i<arr.length-1;i++){
            swaped = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }
        }
    }
}
