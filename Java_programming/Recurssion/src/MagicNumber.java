public class MagicNumber {
    public static void main(String[] args) {

        int n =6;
        int ans = 0;
        int base = 5;

        while (n>0){
            int last = n&1;
            System.out.println("LSB is" + last);
            System.out.println("Before N is"+ n);
            n=n>>1;
            System.out.println("After N is"+ n);
            ans += last*base;
            System.out.println("ans is "+ ans);
            base = base*5;
            System.out.println("base is "+ base);
        }

        System.out.println(ans);
    }
}
