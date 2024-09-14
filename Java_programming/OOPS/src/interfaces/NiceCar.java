package interfaces;

public class NiceCar {
    private Engine engine;

    public NiceCar(){
        engine = new ElectricalEngine();
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
}
