public class Practice {
    public static void main(String[] args) {
        //print(5);
        //System.out.println(product(5));
        //System.out.println(sum(5));
        //System.out.println(sumof_digits(109));
        //System.out.println(productof_digits(12345));
        System.out.println(count_zeros(100034));
    }

    static void print(int n){
        if(n == 0){
            return;
        }
        //System.out.println(n);
        print(n-1);
        System.out.println(n);
    }

    static int product(int n){
        if(n <= 1){
            return 1;
        }
        return n * product(n-1);
    }

    static int sum(int n){
        if(n <= 1){
            return 1;
        }

        return n + sum(n-1);
    }

    static int sumof_digits(int n){
        if(n == 0){
            return 0;
        }

        return (n%10) + sumof_digits(n/10);
    }

    static int productof_digits(int n){
        if(n%10 == n){
            return n;
        }

        return (n%10) * productof_digits(n/10);
    }

    static int count_zeros(int n){
        return helper_count(n,0);
    }

    private static int helper_count(int n, int count){
        if(n == 0){
            return count;
        }
        if(n%10 == 0){
            return helper_count(n/10,count+1);
        }else {
            return helper_count(n/10,count);
        }
    }
}
