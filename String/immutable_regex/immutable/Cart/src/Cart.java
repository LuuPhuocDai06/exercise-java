import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Cart {
    private final List<CartLine> lines;
    private final String currency;

    public Cart(String currency, List<CartLine> lines) {
        Objects.requireNonNull(currency).trim();
        if (currency.isEmpty()) throw new IllegalArgumentException("currency rỗng");
        this.currency = currency;
        this.lines = List.copyOf(lines);
    }

    public Cart(String currency){
        this(currency, List.of());
    }

    public List<CartLine> getLines() {
        return lines;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(lines, cart.lines) && Objects.equals(currency, cart.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lines, currency);
    }

    // hàm add thêm sản phẩm vào giỏ hàng.
    public Cart add(String sku, int qty, Money unitPrice){
        List<CartLine> next = new ArrayList<>();
        boolean found = false;
        for(CartLine cl : lines){
            if(cl.sku().equals(sku.trim())){
                next.add(new CartLine(cl.sku(), cl.qty() + qty, cl.unitPrice()));
                found = true;
            }
            else {
                next.add(cl); // trường hợp món hàng khác nhau.
            }
        }
        if(!found){
            next.add(new CartLine(sku, qty, unitPrice)); // trường hợp giỏ hàng rỗng.
        }
        return new Cart(currency, next);
    }

    // Hàm xóa một sản phẩm bằng tên hàng.
    public Cart remove(String sku){
        if (sku.isEmpty()){
            throw new IllegalArgumentException("tên sản phẩm trống!");
        }
        List<CartLine> next = new ArrayList<>(lines);
        next.removeIf(cl -> cl.sku().equals(sku));
        if(next.size() != lines.size()){
            System.out.println("Tên sản phẩm không tồn tại trong danh sách");
        }

        return new Cart(currency, next);
    }

    // Hàm xem tổng giá của từng sản phẩm.
    public Money total(){
        Money t = Money.zero(currency);
        for(CartLine i : lines){
            t.add(i.subtotal());
        }
        return  t;
    }
}
