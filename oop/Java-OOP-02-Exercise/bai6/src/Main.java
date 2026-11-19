public class Main {
    // hàm trả tổng tiền.
    static double checkout(Payment[] payments){
        double total = 0;
        for (Payment x : payments){
            total += x.payment();
        }
        return total;
    }

    // hàm main.
    public static void main(String[] args){
        int amount = 200;
        Payment[] payments = {new CashPayment(amount), new CardPayment(amount),
                new EWalletPayment(amount), new CryptoPayment(amount)};
        for (Payment i : payments){
            System.out.println("Processing Payment \n"+i.payment());
        }
        System.out.println("Tổng tiền thanh toán bằng tất cả phương thức = "+checkout(payments));
    }


}