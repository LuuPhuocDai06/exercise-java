import java.util.List;
import java.util.Objects;

public class Money implements Comparable<Money> {
    // các thuộc tính.
    private final String currency;
    private final long amount;

    public Money(long amount, String currency){
        this.currency = Objects.requireNonNull(currency).trim().toLowerCase();
        if (this.currency.isEmpty()) throw new IllegalArgumentException("currency không đc trống!");
        if(amount < 0) throw new IllegalArgumentException("Số tiền không hợp lệ!");
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public long getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount && Objects.equals(currency, money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, amount);
    }

    // hàm add thêm tien.
    public Money add(Money other){
        if (!other.currency.equals(currency)) throw new IllegalArgumentException("không trùng currency");
        return new Money(Math.addExact(other.amount, amount), other.currency);
    }

    // Hàm subtract tru tien.
    public Money subtract(Money other){
        if (!other.currency.equals(currency)) throw new IllegalArgumentException("không trùng currency");
        if(other.amount > amount) throw new IllegalArgumentException("Số tiền khong du de rut!");
        return new Money(amount - other.amount, other.currency);
    }

    // Hàm multiply.
    public Money multiply(int factor){
        if(factor < 0) throw new IllegalArgumentException("Số khong hợp lê!");
        return new Money(Math.multiplyExact(amount, factor), currency);
    }

    public static Money zero(String currency){
        return new Money(0, currency);
    }

    public static Money sum(String currency, List<Money> ds){
        Money total = zero(currency);
        for (Money i : ds){
            total = total.add(i);
        }
        return total;
    }

    @Override
    public String toString() {
        return "So tien: "+getAmount()+getCurrency();
    }

    @Override
    public int compareTo(Money o) {
        if (!o.currency.equals(currency)) throw new IllegalArgumentException("lỗi");
        return Long.compare(amount, o.amount);
    }
}