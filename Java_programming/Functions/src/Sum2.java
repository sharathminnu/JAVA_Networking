import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter num1:");
        int num1 = in.nextInt();
        System.out.println("Enter num2:");
        int num2 = in.nextInt();
        int s = sum(num1,num2);
        System.out.println(s);
    }

    static int sum(int num1 , int num2){
        int result = num1 + num2;
        return result;
    }
}
