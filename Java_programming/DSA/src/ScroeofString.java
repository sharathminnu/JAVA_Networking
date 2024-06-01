public class ScroeofString {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(score(str));
        System.out.println(Math.abs(str.charAt(0))); // this prints the ASCII value of char
    }

    static int score(String str){
        int total = 0;
        for(int i=0;i<str.length()-1;i++){
            total += Math.abs(str.charAt(i) - str.charAt(i+1));

        }
        return total;
    }
}
