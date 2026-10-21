import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Order {
    private final String id;
    private final List<Item> items;   // Item là class có setter: setName, setPrice

    public Order(String id, List<Item> items) {
        this.id = Objects.requireNonNull(id, "id không đc bỏ trống!").trim().toLowerCase();
        if (this.id.isEmpty()) throw new IllegalArgumentException("id trống!");
        this.items = Objects.requireNonNull(List.copyOf(items), "Ds không được trống!");
        if (this.items.isEmpty()) throw new IllegalArgumentException("ds Trống!");
    }

    public String getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }

    // hàm add items.
    public Order addItems(Item item){
        List<Item> newItems = new ArrayList<>(items);
        newItems.add(item);
        return new Order(id, newItems);
    }

    // xóa items.
    public Order removeItems(String itemName){
        if (itemName.isEmpty()) throw new IllegalArgumentException("Tên không dc trống!");
        List<Item> newItems = new ArrayList<>(items);
        newItems.removeIf(i -> i.getName().equals(itemName));
        return new Order(id, newItems);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(items, order.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, items);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", items=" + items +
                '}';
    }
}