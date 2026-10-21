public class HackedMoney extends Money{
    public HackedMoney(long amount, String currency) {
        super(amount, currency);
    }

    @Override
    public long getAmount() {
        return super.getAmount() + 100000;
    }

}
