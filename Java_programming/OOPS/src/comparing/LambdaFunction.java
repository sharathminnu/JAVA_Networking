package comparing;

public class LambdaFunction {
    interface Operation{
        int operation(int a,int b);
    }
    private int operation(int a, int b){
        return a;
    }


    public static void main(String[] args) {


        Operation sum = ((a, b) -> {return a+b;});

//        int x = 4;
//        int y = 5;
//
//        System.out.println(sum(4,5));
        LambdaFunction myCal = new LambdaFunction();

        Operation prod = (a ,b) ->a * b;
        Operation diff = (a ,b) -> a-b;

        //System.out.println(myCal.);
    }
}
interface Operation{
    int operation(int a,int b);
}
