public class WrapperclassExample {
    public static void main(String[] args) {
        Integer a = 10;
        //System.out.println(a.hashCode());

        final int b = 10;
        //b = 11;
        final Student_details minnu = new Student_details();
        minnu.rollno = 12;
        minnu.name = "Sharath";
        minnu.marks = 40.1f;

        System.out.println(minnu.name);
        System.out.println(minnu.rollno);
        System.out.println(minnu.marks);

        minnu.name = "minnu";
        System.out.println(minnu.name);

        Student_details random = new Student_details(11,"something",23.5f);
        System.out.println(random.name);
        System.out.println(random.rollno);
        System.out.println(random.marks);

        final Student_details random2;

        //Student_details random2 = random;

        //System.out.println(random2.name);

        Student_details random4 = new Student_details();
        System.out.println(random4.name);

        Student_details random5 = new Student_details();
        System.out.println(random5.name);

    }

    static class Student_details{
        int rollno;
        String name;
        float marks;

        //default constructor
        Student_details(){
            this(14,"randomname",67.f);

        }
        Student_details(int rolno,String naam, float mark){
            this.rollno = rolno;
            this.name = naam;
            this.marks = mark;
        }



    }

}
