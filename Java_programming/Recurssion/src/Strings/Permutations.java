package Strings;

public class Permutations {
    public static void main(String[] args) {
        //permutations("","abc");
        //System.out.println(permutationsCount("","abc"));
        //System.out.println(permCount("","abc"));
        permCount("","abc");

    }

    public static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for(int i = 0;i<= p.length();i++){
            String f = p.substring(0,i);
            System.out.println("first string is:" + f);
            String s = p.substring(i,p.length());
            System.out.println("second sting is:" + s);
            permutations(f+ch+s, up.substring(1));
        }
    }

    public static int permutationsCount(String p, String up){
        //int count = 0;
        if(up.isEmpty()){
           // count++;
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for(int i=0;i<= p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count + permutationsCount(f+ch+s,up.substring(1));
            //permutationsCount(f+ch+s,up.substring(1));

        }
        return count;
    }
// this redundant operation for count
    public static void permCount(String p, String up){
        int count = 0;
        if(up.isEmpty()){
            count++;
            return;
        }

        char ch = up.charAt(0);
        for(int i = 0;i<= p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permCount(f+ch+s, up.substring(1));
        }
    }
}
