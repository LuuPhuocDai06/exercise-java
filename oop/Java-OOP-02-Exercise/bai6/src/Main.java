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

    // Vì đa hình có nghĩa là lớp cha có thể trỏ đến các lớp con và goị nó ra
    // Neu lớp cha là khung mặc định và các lớp con là những hình dạng khung khác nhau và lớp cha có thể gọi tất cả các khung đó hay sử dụng các khung đó đều được
    // vì đã kế thừa từ lớp cho nên các field hay các method đều như lớp chỉ khác dữ liệu ra
    // Nên với bài trên không cần sửa hàm checkout vẫn tính đc vì nó cũng đc lớp cha gọi
    // Nếu trường hợp kh tính đc chỉ có thể lớp con đó không kế thừa lớp cha hoặc không có super trong constructor hay override method từ lớp cha.
    // Nói về lợi ích lớp cha tạo ra bạn đầu để kiểm soát và lớp con là những nhánh hình dạng khác nhau
    // Giúp quản lí và phân loại dễ dàng hơn nếu trường hợp lớp con có nhiều field hay method mà lớp cha không có thì lớp cha không thể gọi và tới đó phát sinh vấn đề.
    // va giải pháp là dùng instanceof để kiểm tra.
    // Nói chung là kiểm soát tốt các luồng giống nhau thì đa hình là lựa chọn hợp lí.
}