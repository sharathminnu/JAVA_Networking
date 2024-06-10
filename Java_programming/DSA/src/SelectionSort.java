package DSA.src;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {4,5,3,1,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int getmaxindex(int []arr,int start, int last){
        int max = start;
        for(int i=0;i<=last;i++){
            if(arr[max] < arr[i]){
                max = i;
            }

        }
        return  max;
    }

    static void swap(int[] arr,int start, int last){
        int temp = arr[last];
        arr[last] = arr[start];
        arr[start] = temp;

    }

    static void selection(int [] arr){

        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxindex = getmaxindex(arr, 0,last);
            swap(arr, maxindex,last);
        }
    }
}
