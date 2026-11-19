public class EWalletPayment extends Payment{
    public EWalletPayment(int amount){super(amount);}

    @Override
    public double payment() {
        if (getAmount() == 0) return 0;
        return super.payment() + 2.2;
    }
}
