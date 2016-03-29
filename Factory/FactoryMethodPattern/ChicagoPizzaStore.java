public class ChicagoPizzaStore extends PizzaStore {

    // Implementation of the Factory Method
    protected Pizza createPizza(String type) {
        if("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        } else if("pepperoni".equals(type)) {
            return new ChicagoStylePepperoniPizza();
        } else if("veggie".equals(type)) {
            return new ChicagoStyleVeggiePizza();
        }
        return null;
    }

}
