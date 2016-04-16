import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu("Main Menu");

        menu.add(new MenuItem("Mussels", "today's chief special", 20.9));
        menu.add(new MenuItem("Seefood Chowder", "today's chief special", 5.9));

        Menu starter = new Menu("Starter");
        menu.add(starter);
        starter.add(new MenuItem("Chicken Wing", "Fried chicken wing", 5.9));
        starter.add(new MenuItem("Caesar", "Vegetable salad", 5.0));

        Menu main = new Menu("Main Course");
        menu.add(main);
        main.add(new MenuItem("Salmon", "Salmon fillet with Lemo", 12.5));
        main.add(new MenuItem("Lamb Stew", "Slow cooked Lamb", 12.5));
        main.add(new MenuItem("Steak", "Traditional Irish beef", 15.9));
      
        Menu dessert = new Menu("Dissert");
        menu.add(dessert);
        dessert.add(new MenuItem("Ice cream", "Strawberry, Vanilla, Caramel", 4.9));
        dessert.add(new MenuItem("Banana", "Fried banana", 3.9));
        
        Menu drink = new Menu("Drink");
        dessert.add(drink);
        drink.add(new MenuItem("Tea", "black tea", 3.6));
        drink.add(new MenuItem("Coffee", "Americano", 3.6));

        menu.print();

        System.out.println("\n\n===============\n===============\n\nAll Menu Items");
        Iterator<MenuComponent> itr = menu.iterator();
        while(itr.hasNext()) {
            itr.next().print();
        }
    }

}
