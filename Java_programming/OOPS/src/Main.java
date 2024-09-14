//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student sharath = new Student();

        //System.out.println(sharath);
        //System.out.println(sharath.rollno);
        //System.out.println(sharath.name);
        //System.out.println(sharath.marks);
        //Student minnu = new Student(14,"minnu",78.9f);

        sharath.rollno = 13;
        sharath.name = "sharath v";
        sharath.marks = 45.6f;

        sharath.greetings();

        Student minnu = new Student(16,"Minnu",50.1f);
        minnu.greetings();

    }


}
class Student{
    int rollno;
    String name;
    float marks;

    void greetings(){
        System.out.println("Hi! My name is " + name);
    }
    //default constructor
    Student(){

    }


    //constructor
    Student(int rollno, String naam, float mark){
        this.rollno = rollno;
        this.name = naam;
        this.marks = mark;

    }
}