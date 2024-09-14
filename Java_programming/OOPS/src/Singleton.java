public class Singleton {
    private static Singleton instance;
    private final String name;
    private final int rollno;

    private Singleton(String name, int rollno){


        this.name = name;
        this.rollno = rollno;
    }

    public Singleton getInstance(){
        if (instance == null){
            instance = new Singleton(name,rollno);
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton obj1 = new Singleton("minnu",32);
        Singleton obj2 = new Singleton("sharath",23);

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }

}
