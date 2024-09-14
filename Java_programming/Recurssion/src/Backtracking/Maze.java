package Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        //System.out.println(count(3,3));
        //pathdi("",3,3);
        System.out.println(pathRet("",2,2));

    }

    public static int count(int r,int c){
        if(r == 1 | c == 1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left+right;
    }

    public static void path(String p,int r,int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r>1){
            path(p + 'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }

    static ArrayList<String> pathRet(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list  = new ArrayList<>();
            System.out.println(p);
            list.add(p);
            return list;

        }
        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            //System.out.println(p);
            list.addAll(pathRet(p + 'D', r-1, c));
            //pathRet(p + 'D', r-1, c);

        }

        if (c > 1) {
            //System.out.println(p);
            list.addAll(pathRet(p + 'R', r, c-1));
            //pathRet(p + 'R', r, c-1);
        }

        return list;



    }
    public static void pathdi(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1 && c>1){
            path(p+ 'd',r-1,c-1);
        }
        if(r>1){
            path(p + 'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }
}
