import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    // hàm main.
    public static void main(String[] args){
        Item pen = new Item("Pen", 10);
        Order o = new Order("A1", List.of(pen));
        System.out.println(o);

        List<Item> src = new ArrayList<>(List.of(new Item("Pen", 10)));

        List<Item> view = Collections.unmodifiableList(src);
        List<Item> copy = List.copyOf(src);

        src.add(new Item("Book", 50));
        System.out.println(view.size());   // 2 -> view đổi theo src
        System.out.println(copy.size());   // 1 -> copy không đổi


        // thêm items mới.
        Order o1 = o.addItems(new Item("keyboard", 10));

        System.out.println(o1);

        Order o2 = o1.addItems(new Item("mouse", 3));

        System.out.println(o2);

        Order o3 = o2.removeItems("Pen");

        System.out.println(o3);

        Order o4 = o3.addItems(new Item("monitor", 10));

        System.out.println(o4);

        Order o5 = o4.addItems(new Item("notebook", 1));

        System.out.println(o5);

        Order o6 = o5.removeItems("monitor");

        System.out.println(o6);
    }
}