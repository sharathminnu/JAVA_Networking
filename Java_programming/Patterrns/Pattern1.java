public class Pattern1 {
    public static void main(String[] args) {
        int n =5;
        pattern_3(n);


    }
    public static void  pattern_1(int n){
        for(int row=1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void pattern_2(int n){
        for(int row=0;row<n;row++){
            for(int col=0;col<n-row-1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void  pattern_3(int n){
        for(int row=1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

}
