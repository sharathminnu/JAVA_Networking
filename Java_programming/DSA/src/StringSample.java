import java.util.ArrayList;

public class StringSample {
    public static void main(String[] args) {
        String str1 = "Minnu";
        String str2 = "Minnu";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == str2); // checks both reference variables  are pointing to same  object.
        str1 = "Sharath Minnu";
        System.out.println(str1);

        String X = "valuex";
        String Y = "valuey";
        System.out.println(X==Y);


        String a = new String("Sharath");
        String b = new String("Sharath");
        System.out.println(a == b);   //comparator
        System.out.println(a.equals(b)); // checks only the values




        float dec = 123.4311f;
        System.out.printf("value is %.2f", dec);
        System.out.println();


        System.out.println('a' + 'b');
        System.out.println("a"+"b");
        System.out.println('a'+3); //here it will convert integer to its wrapper class(Integer) and calls toString method
        System.out.println((char)('a'+3));
        System.out.println("A"+ new ArrayList<>()); // here it calls toString method for arrayList
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(21);

        System.out.println("B"+ arr);
        //System.out.println(new Integer(56) + new ArrayList<>()); this doesn't work because it is an expression
        System.out.println(new Integer(56)+""+ new ArrayList<>());


    }
}
