package interfaces;

public class Car implements Brake, Start, Stop {

    @Override
    public void brake() {
        System.out.println("Apply brakes to the car");
    }

    @Override
    public void start() {
        System.out.println("start the car");
    }

    @Override
    public void stop() {
        System.out.println("stop the car");
    }
}
