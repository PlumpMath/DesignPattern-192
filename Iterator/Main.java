import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        DinnerMenu menu = new DinnerMenu();
        System.out.println("Dinner Menu\n-----------------------------------------------------");
        Iterator itr = menu.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
