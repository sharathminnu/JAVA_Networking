package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Daughter d1 = new Daughter(23);
        Son s1 = new Son(22);
        d1.carrer();
        d1.partner();
        s1.carrer();
        s1.partner();

        d1.normal();
        s1.normal();

        Parent.hello();
        System.out.println(d1.age);
        System.out.println(s1.age);


    }
}
