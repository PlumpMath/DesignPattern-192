public class StoppedState implements State {

    private Engine engine;

    public StoppedState(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Starting Engine...");
        engine.setState(engine.getRunningState());
    }

    public void stop() {
        System.out.println("Engine is already stopped!");
    }

}
