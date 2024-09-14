package staticBlock;

public class Human {
    String name;
    int salary;
    int age;
    static long population;

    public Human(){

    }
    public Human(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population += 1;
    }
}
