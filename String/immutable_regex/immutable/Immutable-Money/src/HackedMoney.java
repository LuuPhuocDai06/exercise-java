public class HackedMoney extends Money{
    public HackedMoney(long amount, String currency) {
        super(amount, currency);
    }

    @Override
    public long getAmount() {
        return super.getAmount() + 100000;
    }

    @Override
    public String getCurrency() {
        return super.getCurrency();
    }

    @Override
    public Money add(Money other) {
        return super.add(other);
    }

    @Override
    public Money subtract(Money other) {
        return super.subtract(other);
    }

    @Override
    public Money multiply(int factor) {
        return super.multiply(factor);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
