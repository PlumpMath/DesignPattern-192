public class Engine {

    private State stoppedState;
    private State runningState;
    
    private State currentState;

    public Engine() {
        stoppedState = new StoppedState(this);
        runningState = new RunningState(this);
        currentState = stoppedState;
    }

    public void start() {
        currentState.start();
    }

    public void stop() {
        currentState.stop();
    }

    void setState(State state) {
        currentState = state;
    }

    State getStoppedState() {
        return stoppedState;
    }

    State getRunningState() {
        return runningState;
    }

}
