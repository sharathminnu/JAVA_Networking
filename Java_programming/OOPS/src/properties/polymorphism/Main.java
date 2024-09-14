package properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes a = new Square(); // this is called as upcasting . JVM decides which method to call based on object type not
        //reference type . works based on dynamic method dispatch(run time polymorphism.
        a.area();

        Numbers num = new Numbers();
        System.out.println(num.sum(1,2,3));

    }
}
