public class Stereo {

    private String cd;
    private int volume;

    public void on() {
        System.out.println("The stereo is on");
    }

    public void off() {
        System.out.println("The stereo is off");
    }

    public void setCd(String cd) {
        this.cd = cd;
        System.out.println("The CD is set as " + cd);
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("The volume is set as " + volume);
    }

}
