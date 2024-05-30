public class Searchin2D {
    public static void main(String[] args) {

        int key = 100;
        int[][] arr = {{23, 56, 13}, {12, 89, 45}, {31, 29, 10}};

        boolean result = searcharr(arr, key);

        if (result == false) {
            System.out.println(" key element not found");

        }
    }

    static boolean searcharr(int[][] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Key element found at " + i + " row and " + j + " coloumn");
                    return true;
                }
            }
        }
        return false;
    }
}

