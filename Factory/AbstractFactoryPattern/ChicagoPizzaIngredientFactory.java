public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

}
