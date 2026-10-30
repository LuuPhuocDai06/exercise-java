import java.util.List;
import java.util.Objects;

public record Money(long amount, String currency) implements Comparable<Money>{
    public Money(long amount, String currency){
        Objects.requireNonNull(currency);
        if (amount < 0) throw new IllegalArgumentException("Amount phải lớn hơn 0");
        this.amount = amount;
        if (currency.isEmpty()) throw new IllegalArgumentException("currency không được rỗng");
        this.currency = currency;
    }

    public Money add(Money other){
        if (!other.currency.equals(currency)) throw new IllegalArgumentException("currency khong giống nhau");
        return new Money(Math.addExact(amount, other.amount), currency);
    }

    public Money subtract(Money other){
        if (!other.currency.equals(currency)) throw new IllegalArgumentException("currency khong giống nhau");
        if (other.amount > amount) throw new IllegalArgumentException("Amount quá lớn nên không thể rút");
        return new Money(Math.subtractExact(amount, other.amount), currency);
    }

    public Money mutiply(int factor){
        if (factor < 0) throw new IllegalArgumentException("Factor phải lớn hon 0");
        return new Money(Math.subtractExact(factor, amount), currency);
    }

    public static Money zero(String currency){
        return new Money(0, currency);
    }

    public static Money sum(String currency, List<Money> list){
        Money total = zero(currency);
        for(Money i : list){
            total = total.add(i);
        }
        return total;
    }

    @Override
    public int compareTo(Money o) {
        if (!o.currency.equals(currency)) throw new IllegalArgumentException("currency không giống nhau");
        return Long.compare(amount, o.amount);
    }

    @Override
    public String toString() {
        return amount+" - "+currency;
    }

}
