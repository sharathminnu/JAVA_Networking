public class Palindrome {
    public static void main(String[] args) {
        String str = "abccba";
        System.out.println(isPalindrome(str));
        System.out.println(checkPalindrome(str));

    }

    public static boolean isPalindrome(String str){
        if(str == null || str.length() == 0){
            return false;
        }
        str = str.toLowerCase();

        for(int i=0;i<=str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-i-1);
            if(start!=end){
                return false;
            }
        }
        return true;
    }

    public static boolean checkPalindrome(String str){
        if(str == null || str.length() == 0){
            return false;
        }
        str = str.toLowerCase();
        int s = 0;
        int e = str.length() - 1;
        while (s < e){
            char start = str.charAt(s);
            char end = str.charAt(e);
            if(start!=end){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
