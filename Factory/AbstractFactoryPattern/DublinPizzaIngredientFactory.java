public class DublinPizzaIngredientFactory implements PizzaIngredientFactory {

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

}
