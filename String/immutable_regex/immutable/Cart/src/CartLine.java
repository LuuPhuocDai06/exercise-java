import java.util.Locale;
import java.util.Objects;

public record CartLine(
        String sku,
        int qty,
        Money unitPrice
) {
    public CartLine(String sku, int qty, Money unitPrice){
        Objects.requireNonNull(sku);
        Objects.requireNonNull(unitPrice);
        if (sku.isEmpty()) throw new IllegalArgumentException("SKU rỗng!");
        if (unitPrice.toString().isEmpty()) throw new IllegalArgumentException("unitPrice rỗng");
        if (qty < 0) throw new IllegalArgumentException("qty phải lớn hơn 0");
        this.sku = sku.trim();
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public Money subtotal(){
        return unitPrice.mutiply(qty);
    }
}
