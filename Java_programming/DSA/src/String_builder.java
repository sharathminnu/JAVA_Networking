public class String_builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        //str.append('a');
        System.out.println(str);
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            str.append(ch);

        }
        System.out.println(str);
    }
}
