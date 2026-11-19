public class CryptoPayment extends Payment{
    public CryptoPayment(int amount){
        super(amount);
    }

    @Override
    public double payment() {
        return super.payment() + 2.55;
    }
}
