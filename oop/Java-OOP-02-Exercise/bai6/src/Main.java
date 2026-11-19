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

    // checkout nhận mảng Payment[], mỗi phần tử là biến kiểu Payment nhưng trỏ tới đối tượng con
    // (Cash, Card, EWallet, Crypto). Khi gọi x.payment(), Java chạy bản payment()
    // của đối tượng thật lúc runtime, nên mỗi loại tự tính phí theo cách riêng
    // mà checkout không cần biết đó là loại nào.
    // Vì vậy thêm CryptoPayment (chỉ cần extends Payment và override)
    // thì checkout không phải sửa dòng nào.
}