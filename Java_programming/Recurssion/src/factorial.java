public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));


    }

    static int fact(int n){
        if(n==1){
            return n;
        }
        //System.out.println(n*n-1);
        return n * fact(n-1);
        //System.out.println(n*n-1);

    }
}
