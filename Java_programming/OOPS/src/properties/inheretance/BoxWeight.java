package properties.inheretance;

public class BoxWeight extends Box{
    double weight;
    int serial_number;

    void greet(){
        System.out.println("Hi in BoxWeight");
    }

    BoxWeight(){
        this.weight = -1;
        this.serial_number = 1;

    }

    BoxWeight(double weight,int serial_number){
        this.weight = weight;
        this.serial_number = serial_number;
    }

    BoxWeight(double l,double w,double b, double weight, int serial_number){
        super(l,w,b);
        this.weight = weight;
        this.serial_number = serial_number;
    }
    BoxWeight(double side,double weight,int serial_number){
        super(side);
        this.weight = weight;
        this.serial_number = serial_number;
    }
}

