public class Milk extends CondimentDecorator {

    private Coffe coffe;

    public Milk(Coffe coffe) {
        this.coffe = coffe;
    }

    public String getDescription() {
        return coffe.getDescription() + " with Milk";
    }

    public float cost() {
        return coffe.cost() + 0.5f;
    }

}
