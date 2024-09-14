package abstractDemo;

public  class Daughter extends Parent {
    @Override
    void carrer() {
        System.out.println("I will be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I want love him");
    }

    public Daughter(int age){
        super(age);
    }
}
