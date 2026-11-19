public class Payment {
    private int amount;

    public Payment(){}
    public Payment(int amount){
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    // hàm payment.
    public double payment(){
        return amount;
    }
}
