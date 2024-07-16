public class countzeros {
    static int res = 0;
    public static void count(int n){
        if(n == 0) {
            return;
        }
        if(n%10 == 0){
            res++;
        }
        count(n/10);
    }

    public static int cont2(int n , int count){
        if(n == 0){
            return count;
        }
        if(n%10 == 0){
            return cont2(n/10,count+1);
        }else {
            return cont2(n/10,count);
        }
        //return count;
    }
    public static void main(String[] args) {
        //int n = 10;
        //System.out.println(n%10);
        //count(130140);
        //System.out.println(res);

        int n = 4508900;
        System.out.println(cont2(n,0));


    }
}
