public class RunningState implements State {

    private Engine engine;

    public RunningState(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Engine is already started!");
    }

    public void stop() {
        System.out.println("Stopping engine...");
        engine.setState(engine.getStoppedState());
    }

}
