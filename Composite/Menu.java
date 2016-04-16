import java.util.Vector;
import java.util.Iterator;
import java.util.Stack;
import java.lang.UnsupportedOperationException;

public class Menu extends MenuComponent {

    private Vector<MenuComponent> components = new Vector<>();
    private String name;

    public Menu(String name) {
       this.name = name;
    }

    @Override
    public void add(MenuComponent component) {
        components.add(component); 
    }

    @Override
    public void print() {
        System.out.println("\n" + name + "\n--------------------------------------");
        for(MenuComponent component : components) {
           component.print();
        }
    }

    @Override
    public Iterator<MenuComponent> iterator() {
        return new Itr();
    }

    class Itr implements Iterator<MenuComponent> {

        Stack<Iterator<MenuComponent>> stack = new Stack<>();

        public Itr() {
            stack.push(components.iterator());
        }

        @Override
        public boolean hasNext() {
            if(stack.isEmpty()) {
                return false;
            } else {
                Iterator itr = stack.peek();
                if(!itr.hasNext()) {
                    stack.pop();
                    return hasNext();
                } else {
                    return true;
                }
            }
        }

        @Override
        public MenuComponent next() {
            if(hasNext()) {
                Iterator<MenuComponent> itr = stack.peek();
                MenuComponent component = itr.next();
                if (component instanceof Menu) {
                    Iterator<MenuComponent> menuItr = component.iterator();
                    stack.push(menuItr);
                    return next();
                } else {
                    return component;
                }
            } else {
                return null;
            }
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    } 

}
