public class Sugar extends CondimentDecorator {

    private Coffe coffe;

    public Sugar(Coffe coffe) {
        this.coffe = coffe;
    }

    public String getDescription() {
        return coffe.getDescription() + " with Sugar";
    }

    public float cost() {
        return coffe.cost() + 0.2f;
    }

}
