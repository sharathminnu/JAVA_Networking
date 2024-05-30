public class LinearSearch {
    public static void main(String[] args) {

        int key = 34;
        int[] arr = {34,1,67,45,23,90,7,13,69};
        int result = linearsearch(arr,key);
        if(result == -1){
            System.out.println("Key elament Not found");
        }else {
            System.out.println("Key element found at index:" + result);
        }
    }

    static int  linearsearch(int[] arr, int key) {
        int result = -1;
        for (int i = 0;i<arr.length;i++){
            if(arr[i] == key){
                result = i;
                break;
            }
        }
        return result;



//        return  result;
    }
}
