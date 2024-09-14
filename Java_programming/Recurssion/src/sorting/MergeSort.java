package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {8,4,9,12,6,5};
        int [] ans = mergesort(arr);   // it's not modifying exsisting  array
        System.out.println(Arrays.toString(ans));
        Arrays.sort(arr);


        int [] sample = {5,4,3,2,1};
        int [] sam_ans = (Arrays.copyOfRange(sample,0,3));
        System.out.println(Arrays.toString(sample));
        System.out.println(Arrays.toString(sam_ans));

    }

    static int [] mergesort(int [] arr){
        if(arr.length == 1){
            return arr;

        }

        int mid = arr.length/2;

        int [] left = mergesort(Arrays.copyOfRange(arr,0, mid));
        int [] right = mergesort(Arrays.copyOfRange(arr, mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int mix[] = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i< left.length && j < right.length){
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < left.length){
            mix[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;

    }

}
