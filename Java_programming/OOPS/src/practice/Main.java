package practice;

public class Main {
    public static void main(String[] args) {
//        Main m1 = new Main();
//        Main.fun();
//        //m1.fun2();

//        InnerClass obj = new InnerClass();
//        InnerClass.Test o1 = new InnerClass.Test();
//        InnerClass.Test tobj = new InnerClass.Test();
//        tobj.print();

        StaticExample obj = new StaticExample();
        System.out.println(obj.a + " " + obj.b);
        StaticExample.b += 5;
        System.out.println(obj.a + " " + obj.b);

        StaticExample onj = new StaticExample();
        System.out.println(onj.a + " " + onj.b);



    }

    static void fun(){
        System.out.println("static fun");

        Main obj = new Main();
        obj.fun2();
    }

    void fun2(){
        System.out.println("non static in fun");
    }
}
