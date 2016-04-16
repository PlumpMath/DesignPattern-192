import java.util.Iterator;
import java.lang.UnsupportedOperationException;

public class MenuItem extends MenuComponent {

    private String name;
    private String description;
    private double price;

    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println(name + "\t[" + description +"]\t£" + price);
    }

    @Override
    public Iterator<MenuComponent> iterator() {
        return new Itr();
    }

    class Itr implements Iterator<MenuComponent> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public MenuComponent next() {
            return null;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

}
