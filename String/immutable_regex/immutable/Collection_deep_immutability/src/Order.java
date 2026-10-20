import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Order {
    private final String id;
    private final List<Item> items;   // Item là class có setter: setName, setPrice

    public Order(String id, List<Item> items) {
        this.id = id;
        this.items = List.copyOf(items);
    }

    public String getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }

    // hàm add items.
    public Order addItems(Item item){
        if (item.getName().isEmpty()) throw new IllegalArgumentException("Ten khong dc de trong!");
        if (item.getPrice() < 0) throw new IllegalArgumentException("Gia tien phải lon hơn 0");

        List<Item> newItems = new ArrayList<>(items);
        newItems.add(item);

        return new Order(getId(), newItems);
    }

    // xóa items.
    public Order removeItems(String itemName){
        if (itemName.isEmpty()) throw new IllegalArgumentException("Tên không dc trống!");

        List<Item> newItems = new ArrayList<>(items);
        for(int i = 0; i < items.size(); i++){
            if(itemName.equals(items.get(i).getName())){
                newItems.remove(items.get(i));
            }
        }
        return new Order(getId(), newItems);
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