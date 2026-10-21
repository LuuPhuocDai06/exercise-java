import java.util.Objects;

public final class Item {
    private final String name;
    private final long price;

    public Item(String name, long price) {
        this.name = Objects.requireNonNull(name).trim().toLowerCase();
        if (this.getName().isEmpty()) throw new IllegalArgumentException("Name không được để trống!");
        if(price <= 0 ) throw new IllegalArgumentException("Price phải lớn hơn 0.");
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return price == item.price && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
