
public class SearchinString {

    public static void main(String[] args) {

        String str = "sharath";
        char c = 'i';
        System.out.println(searchstring(str,c));
    }

    static boolean searchstring(String str, char c) {

        if(str.length() == 0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(c == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
