public class funReverse {
    public static void main(String[] args) {
        //rev(5);
        printcalls(5);

    }

    static void rev(int n){
        if(n == 0){
            return;
        }

        rev(n-1);
        System.out.println(n);

    }

    static void  printcalls(int n){
        if(n ==0){
            return;
        }
        System.out.println("recursion call" + n);
        printcalls(n-1);
        System.out.println("backtracking call" + n);
    }

}
