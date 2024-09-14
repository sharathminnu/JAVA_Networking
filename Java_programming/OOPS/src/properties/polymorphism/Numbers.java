package properties.polymorphism;

public class Numbers {
    //@Override
    double sum(double a, double b, double c){
        return a + b + c;
    }
    //@Override
    int sum(int a, int b, int c){
        return a+b+c;
    }

    int sum(int a,int b){
        return a;
    }
}
