package abstractDemo;

public class Son extends Parent{
    @Override
    void carrer() {
        System.out.println("I want be a cricketer");
    }

    @Override
    void partner() {
        System.out.println("I love her");
    }

    public Son(int age){
        super(age);
    }
}
