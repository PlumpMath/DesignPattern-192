public class Main {

    public static void main(String[] args) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        Pizza pizza = new CheesePizza(ingredientFactory);
        pizza.prepare();
    }

}
