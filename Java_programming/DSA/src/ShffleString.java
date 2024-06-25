public class ShffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] arr = {4,5,6,7,0,2,1,3};
        System.out.println(s.length());
        char[] result = new char[s.length()];

        //StringBuilder str = new StringBuilder();

        for(int i=0;i<arr.length;i++){
            int index = arr[i];
            //str.insert(index,s.charAt(i));
            result[index] = s.charAt(i);
        }
        //System.out.println(str);
        String shfflestring = new String(result);
        System.out.println(shfflestring);

    }

}
