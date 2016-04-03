public class Main {

    public static void main(String[] args) {
        Lights lights = new Lights();
        Screen screen = new Screen();
        Projector projector = new Projector();
        DvdPlayer dvd = new DvdPlayer();

        HomeTheaterFacade facade = new HomeTheaterFacade(lights, screen, projector, dvd);
        facade.watchMovie("Mission Impossible");
        System.out.println(".\n.\n.");
        facade.endMovie();
    }

}
