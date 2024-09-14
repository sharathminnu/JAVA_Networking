package abstractDemo;

public abstract class Parent {
    abstract void carrer();
    abstract void partner();

    void normal(){
        System.out.println("I am normal method");
    }

    static  void hello(){
        System.out.println("hey");
    }

    int age;
    final int value;

    public Parent(int age){
        this.age = age;
        value =324566;
    }


}
