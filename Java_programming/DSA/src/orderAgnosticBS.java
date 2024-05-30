public class orderAgnosticBS {
    public static void main(String[] args) {
        int key = 9;
        int[] arr = {90,87,65,54,41,30,23,12,9,6,4,2};
        int result = binarysearch(arr,key);

        if(result == -1 ){
            System.out.println("Key Element Not found");
        }else {
            System.out.println("Key Element found at index:" + result);
        }
    }

    static int binarysearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        boolean isASC ;
        if(arr[start]<arr[end]){
            isASC = true;
        }else{
            isASC = false;
        }
        System.out.println(isASC);

        while(start<= end){
            int mid = start + (end - start)/2;

            if(key == arr[mid]){
                return mid;
            }

            if(isASC){
                if(key < arr[mid]){
                    end = mid-1;
                }else{
                    start = mid +1;
                }
            }else{
                if(key > arr[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }

        return -1;
    }
}
