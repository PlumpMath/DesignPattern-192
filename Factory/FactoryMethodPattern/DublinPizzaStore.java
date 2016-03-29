public class DublinPizzaStore extends PizzaStore {

    // Implementation of the Factory Method
    protected Pizza createPizza(String type) {
        if("cheese".equals(type)) {
            return new DublinStyleCheesePizza();
        } else if("pepperoni".equals(type)) {
            return new DublinStylePepperoniPizza();
        }
        return null;
    }

}
