import java.util.Arrays;
import java.util.Scanner;

public class MultiDarr {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

        //input

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
    /*method 1 for output
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }*/

        /*method 2 for output

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }*/

        //method 3 for output

        for(int [] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
