package properties.inheretance;

public class Main {
    public static void main(String[] args) {
        //Box box1 = new Box(1.2,2.3,3.4);
        //Box box = new Box(box1);

        //System.out.println(box.l);

        //BoxWeight bw = new BoxWeight(12,13,14,50.0,1);
        //System.out.println(bw.w);
        //BoxWeight bw1 = new BoxWeight(14.0,24.0,12);
        //System.out.println(bw1.weight);
        //System.out.println("Hello");

        BoxWeight bw1 = new BoxWeight(12.0,12.0,12.0,24.0,1);
        BoxWeight bw2 = new BoxWeight(13.0,50.0,2);
        System.out.println(bw1.l);
        System.out.println(bw2.w);
        Box bw = new BoxWeight(13.0,50.0,3);
        //System.out.println(bw3.);
        Box bw3 = new Box();
        bw3.greetings();

        Box box = new BoxWeight(89.0,76.0,10);
        System.out.println(box.b);
    }
}
