public class FindinRange {
    public static void main(String[] args) {

        int key = 12;
        int rs = 1;
        int re = 4;
        int[] arr = {1,8,34,23,8,5,9,12};
        System.out.println(searchinrange(arr,rs,re,key));
    }

    static boolean searchinrange(int[] arr, int rs, int re, int key) {

        for(int i=rs;i<=re;i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }
}
