import java.util.Objects;

public final class Money {
    // các thuộc tính.
    private final String currency;
    private final long amount;

    public Money(long amount, String currency){
        if(currency.isEmpty()) throw new IllegalArgumentException("Giá cả rỗng!");
        if(amount < 0) throw new IllegalArgumentException("Số tiền không hợp lệ!");
        this.currency = currency;
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
        if(!other.currency.equalsIgnoreCase(getCurrency())) throw new IllegalArgumentException("khong cung tien te!");
        return new Money(getAmount() + other.amount, other.currency);
    }

    // Hàm subtract tru tien.
    public Money substract(Money other){
        if(!other.currency.equalsIgnoreCase(getCurrency())) throw new IllegalArgumentException("Khong cung tien te!");
        if(other.amount > getAmount()) throw new IllegalArgumentException("Số tiền khong du de rut!");

        return new Money(getAmount() - other.getAmount(), other.getCurrency());
    }

    // Hàm multiply.
    public Money Multiply(int factor){
        if(factor <= 0) throw new IllegalArgumentException("Số khong hợp lê!");
        return new Money(this.getAmount() * factor, this.getCurrency());
    }

    @Override
    public String toString() {
        return "So tien: "+getAmount()+getCurrency();
    }

}