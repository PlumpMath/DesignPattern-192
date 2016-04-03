public class HomeTheaterFacade {

    private Lights lights;
    private Screen screen;
    private Projector projector;
    private DvdPlayer dvd;

    public HomeTheaterFacade(Lights lights, Screen screen, Projector projector, DvdPlayer dvd) {
        this.lights = lights;
        this.screen = screen;
        this.projector = projector;
        this.dvd = dvd;
    }

    public void watchMovie(String movie) {
        System.out.println("[Start watching movie '" + movie + "']");
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("[Shutting movie theater down]");
        lights.on();
        screen.up();
        projector.off();
        dvd.off();
    }

}
