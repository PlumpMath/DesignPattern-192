import java.lang.UnsupportedOperationException;
import java.util.Iterator;

public abstract class MenuComponent {

    public void print() {
        throw new UnsupportedOperationException();
    }

    public void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public Iterator<MenuComponent> iterator() {
        throw new UnsupportedOperationException();
    }

}
