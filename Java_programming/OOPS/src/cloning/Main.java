package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human h1 = new Human(23,"sharath");

        Human twin = (Human)h1.clone();

        System.out.println(twin.age+ " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(h1.arr));
        System.out.println(Arrays.toString(twin.arr));
    }
}
