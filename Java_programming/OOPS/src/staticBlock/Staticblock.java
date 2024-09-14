package staticBlock;

public class Staticblock {
    static int a = 4;
    static  int b;

    static{
        System.out.println("in static block");
        b = a * 5;

    }

    public static void main(String[] args) {
        Staticblock obj1 = new Staticblock();
        System.out.println(obj1.a);
        System.out.println(obj1.b);

        Staticblock.b = b+3;

        System.out.println(obj1.b);

        Staticblock obj2 = new Staticblock();
        System.out.println(obj2.b);
    }
}
