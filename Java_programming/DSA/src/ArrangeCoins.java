public class ArrangeCoins {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(arrangeCoins(n));

    }

    static int arrangeCoins(int n) {
        int s = 0;
        while(n>=0){
            if(n == 1 && s == 0){
                return n;
            }
            s++;
            System.out.print("S :" + s);
            n = n-s;
            System.out.print("N :" + n);
        }
        return s -1;

    }
}
