public class Cream extends CondimentDecorator {

    private Coffe coffe;

    public Cream(Coffe coffe) {
        this.coffe = coffe;
    }

    public String getDescription() {
        return coffe.getDescription() + " with Cream";
    }

    public float cost() {
        return coffe.cost() + 0.6f;
    }

}
