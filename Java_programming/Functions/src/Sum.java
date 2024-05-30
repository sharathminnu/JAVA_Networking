import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = in.nextInt();
        System.out.println("Enter number2:");
        int num2 = in.nextInt();

        int s = num1+num2;
        System.out.println(s);
    }
}
