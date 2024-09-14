package comparing;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
    Student sharath = new Student(12,40f);
    Student minnu = new Student(13,41f);

    if(sharath.compareTo(minnu) < 0 ){
        System.out.println("minnu has more marks");
    }
    }
}
