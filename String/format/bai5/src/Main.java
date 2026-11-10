import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    // method trả về số tiền vn.
    public static String formatMoney(long amount){
        Locale vn = Locale.of("vi", "VN");
        NumberFormat fmvn = NumberFormat.getCurrencyInstance(vn);
        return fmvn.format(amount);
    }

    // hàm main.
    public static void main(String[] args){
        // trả về số tiền kiểu Việt Nam, dùng dấu chấm phân cách hàng nghìn, ví dụ formatMoney(1250000) → 1.250.000 ₫.
        System.out.println("1250000 -> "+formatMoney(1250000));
        // Yêu cầu:
        // 1. In thử String.format("%,d", 1250000) với Locale.US và Locale.GERMANY (hoặc Locale.of("vi", "VN")
        // nếu Java 19+, new Locale("vi", "VN") nếu cũ hơn), quan sát khác biệt.
        System.out.println(String.format(Locale.US, "\nvới US: %,d ", 1250000));
        System.out.println(String.format(Locale.GERMANY, "với Germany: %,d ", 1250000));

        // 3. Trả lời ngắn (1-2 câu): tại sao trên server nên truyền Locale rõ ràng khi format số?
        // tại vì mỗi quốc gia mỗi kiểu như Đức thì giống vn về dùng chấm , để ngăn cách giá trị hàng nghìn, Mỹ thì dùng dấu .
        // và mỗi quốc gia còn có ký hiểu tiền khác nhau nữa và nhiều thứ khác.

    }
}