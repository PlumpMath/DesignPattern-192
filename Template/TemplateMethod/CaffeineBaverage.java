public abstract class CaffeineBaverage {

    // Template Method
    protected final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected final void boilWater() {
        System.out.println("Boiling Water");
    }

    protected final void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    // Hook Method
    void hook() {
    }
}
