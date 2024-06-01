import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int key = 37;

        int[][] arr = {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        System.out.println(Arrays.toString(search(arr,key)));
        //System.out.println(search(arr,key)); it will print object reference
    }

    static int[] search(int[][] arr, int key) {
        int r = 0;
        int c = arr.length - 1;

        while(r < arr.length && c >= 0){
            if(arr[r][c] == key){
                return new int [] {r,c};
            }
            if(arr[r][c] > key){
                c--;
            }
            if(arr[r][c] < key){
                r++;
            }
        }
        return new int[] {-1,-1};
    }
}
