import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        // ArrayList<Wrapper class> variable name = new ArrayList<>();
        ArrayList<Integer> list  = new ArrayList<>();

        list.add(34);
        list.add(45);
        list.add(78);
        list.add(13);
        list.add(23);

        System.out.println(list);
        list.set(1, 90);
        System.out.println(list);

    }
}
