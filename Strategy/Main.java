public class Main {

    public static void main(String[] args) {
        Character knight = new Knight();
        knight.fight();
        knight.setWeapon(new PistolBehavior());
        System.out.println("Knight picked a pistol");
        knight.fight();
    }

}
