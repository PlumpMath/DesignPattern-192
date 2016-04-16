import java.util.Iterator;
import java.lang.UnsupportedOperationException;

public class DinnerMenu {

    static final int MAX_ITEMS = 6;

    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinnerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];
        addItem("DaQianJi", "Suan la zha ji", 12.9);
        addItem("HongShaoDouFu", "Dou fu, qing jiao", 9.9);
        addItem("JianNiangSanBao", "Jia rou qing jiao, qie zi, dou fu", 12.9);
        addItem("LuYu", "Qing zheng lu yu", 16);
        addItem("GanBianSiJiDou", "Gan bian chang dou jiao, la", 8.9);
        addItem("YouMenDaXia", "You men da xia", 15);
    }

    public void addItem(String name, String description, double price) {
        if(numberOfItems < MAX_ITEMS) {
            menuItems[numberOfItems++] = new MenuItem(name, description, price);
        } else {
            System.out.println("The menu is full");
        }
    }

    public Iterator iterator() {
        return new Itr();
    }

    class Itr implements Iterator {

        int position = 0;

        @Override
        public boolean hasNext() {
            if (position >= menuItems.length || menuItems[position] == null) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public MenuItem next() {
            return menuItems[position++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

}
