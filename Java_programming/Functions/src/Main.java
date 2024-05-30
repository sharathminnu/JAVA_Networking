import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = in.nextInt();
        System.out.println("Enter number2:");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);

    }
}