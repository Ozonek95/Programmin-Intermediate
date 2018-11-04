package inheritenceexercise2;

public class Engine implements EngineInterface{
    boolean engineIsOn;

    public Engine() {
        this.engineIsOn = false;
    }

    public void startEngine() {
        engineIsOn = true;

    }

    public void shutDownEngine() {
        engineIsOn = false;
    }

    @Override
    public boolean getEngineIsOn() {
        return engineIsOn;
    }
}
