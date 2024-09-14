package staticBlock;

public class Main {
    public static void main(String[] args) {
        //Human h1 = new Human(23,"sharath",30000);
        //Human h2 = new Human(24,"VC",34000);

        //System.out.println(Human.population);

        //fun2();
        fun();
        Main funnn = new Main();
        funnn.fun2();
    }
    static void fun(){
        //greetings();

        Main obj = new Main();
        obj.greetings();
    }

    void fun2(){
        greetings();
    }

    void greetings(){
        System.out.println("hello world");
    }
}
