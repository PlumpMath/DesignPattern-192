public class MenuItem {

    private String name;
    private String description;
    private double price;

    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String toString() {
        return name + "\t[" + description +"]\t£" + price;
    }

}
