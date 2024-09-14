package practice;

public class StaticExample {
    static int a = 4;
    static int b = 5;

    static {
        System.out.println("in static block");
        b = a*5;
    }

}

