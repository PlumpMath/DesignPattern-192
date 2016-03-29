public class Main {

    public static void main(String[] args) {
        PizzaStore store = new ChicagoPizzaStore();
        Pizza pizza = store.orderPizza("cheese");
        System.out.println("Dave ordered a " + pizza.getName() + " from Chicago pizza store.");
    }

}
