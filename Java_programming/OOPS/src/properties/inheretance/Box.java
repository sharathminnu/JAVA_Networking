package properties.inheretance;

public class Box {
    double l;
    double w;
    double b;

    Box(){
        this.l = -1;
        this.w = -1;
        this.b = -1;
    }

    Box(double l,double w,double b){
        this.l = l;
        this.w = w;
        this.b = b;
    }

    Box(double side){
        this.l = side;
        this.w = side;
        this.b = side;
    }

    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.b = old.b;
    }

    void greetings(){
        System.out.println("Hello greetings");
    }

}
