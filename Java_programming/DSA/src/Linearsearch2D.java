public class Linearsearch2D {
    public static void main(String[] args) {
        int key = 41;
        int[][] arr = {{13,45,87},{12,34,95},{1,3,40}};
        boolean result = linearsearch(arr,key);
        if(!result){
            System.out.println("Key element not found");
        }
    }

    static boolean linearsearch(int[][] arr,int key){
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] == key){
                    System.out.println("Key elemnet found at row:"+ row +" coloumn :"+ col);
                    return true;
                }
            }
        }
        return false;
    }
}
