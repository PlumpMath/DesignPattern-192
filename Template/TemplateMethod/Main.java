public class Main {

    public static void main(String[] args) {
        System.out.println("Tea: ");
        Tea tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\nCoffee:");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }

}
