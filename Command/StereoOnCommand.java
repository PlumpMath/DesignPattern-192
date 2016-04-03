public class StereoOnCommand implements Command {

    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCd("Jay");
        stereo.setVolume(8);
    }

    public void undo() {
        stereo.off();
    }

}
