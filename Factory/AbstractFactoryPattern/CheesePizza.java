public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        // ...
        Cheese cheese = ingredientFactory.createCheese();
        Sauce sauce = ingredientFactory.createSauce();
        // ...
        System.out.println(cheese);
        System.out.println(sauce);
    }

}
