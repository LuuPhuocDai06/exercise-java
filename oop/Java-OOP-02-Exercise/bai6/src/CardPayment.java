public class CardPayment extends Payment{
    public CardPayment(int amount){
        super(amount);
    }

    @Override
    public double payment() {
        return super.payment() + (super.getAmount() * 0.02);
    }
}
