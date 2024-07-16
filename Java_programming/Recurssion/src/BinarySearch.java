public class BinarySearch {
    public static void main(String[] args) {
        int []arr = {1,2,4,5,23,36,45,78,90};
        int target = 78;
        int result = search(arr, target, 0, arr.length - 1);
        System.out.println(result);

    }

    public static int search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return search(arr,target,s,m -1);
        }
        return search(arr,target,m+1,e);
    }
}
