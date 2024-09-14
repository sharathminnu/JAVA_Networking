package interfaces;

public class ElectricalEngine implements Engine{
    @Override
    public void stop() {
        System.out.println("stop electrical engine");
    }

    @Override
    public void start() {
        System.out.println("start electrical engine");
    }
}
