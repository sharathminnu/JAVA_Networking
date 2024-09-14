import java.util.ArrayList;

public class LinearSearch_Recurssion {
    public static void main(String[] args) {
        int [] arr = {1,3,5,4,4,8,9};
        int target = 4;
        System.out.println(find(arr,target,0));
        System.out.println(findIndex(arr,target,0));
        findallIndex(arr,target,0);
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(findall_IndexList(arr,target,0,list1));
    }

    static boolean find(int [] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr,target,index + 1);
    }

    static int findIndex(int[] arr,int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else {
            return findIndex(arr,target,index + 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findallIndex(int[] arr, int target , int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findallIndex(arr,target,index + 1);
    }

    static ArrayList<Integer> findall_IndexList(int [] arr, int target , int index , ArrayList<Integer> list1){
        if(index == arr.length){
            return list1;
        }
        if (arr[index] == target){
            list1.add(index);
        }
        //System.out.println(list1);
        return findall_IndexList(arr,target,index + 1 ,list1);

    }
}
