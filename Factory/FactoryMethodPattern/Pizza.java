import java.util.List;
import java.util.ArrayList;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String source;
    protected List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name + "[" + dough + ", " + source + ", " + toppings + "]");
    }

    void bake() {
        System.out.println("Baking for 25 mins at 350 ...");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

}
