public class sumofdigits {
    public static void main(String[] args) {
        System.out.println(sum(1324));
        /*int n = 134;
        int n1 = n/10;
        int n2 = n%10;
        System.out.println(n1);
        System.out.println(n2);*/
        int n = 4321;
        int d = (int)(Math.log10(n)) + 1;// calculate the number of digits in a number
        System.out.println(d);

    }

    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }
}
