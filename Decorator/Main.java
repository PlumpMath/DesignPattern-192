public class Main {

    public static void main(String[] args) {
        Coffe latte = new Sugar(new Milk(new Latte()));
        System.out.println(latte.getDescription() + " : €" + latte.cost());
    }

}
