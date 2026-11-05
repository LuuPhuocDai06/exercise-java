import java.util.regex.Matcher;

public class Main {
    // hàm isvalid
    public static Boolean isValid(String input, String regex){
        return input.matches(regex);
    }

    // hàm main.
    public static void main(String[] args){
        // 1. Kiểm tra mã sinh viên gồm 2 chữ cái in hoa, theo sau là 6 chữ số (ví dụ DH123456).
        String mssv1 = "DH123456";
        String mssv2 = "Dh123456";
        String mssv3 = "DH1234568";
        System.out.println("1. Kiểm tra mã sinh viên gồm 2 chữ cái in hoa, theo sau là 6 chữ số (ví dụ DH123456).");
        System.out.println("MSSV: "+mssv1+" -> "+mssv1.matches("[A-Z]{2}\\d{6}"));
        System.out.println("MSSV: "+mssv2+" -> "+mssv2.matches("[A-Z]{2}\\d{6}"));
        System.out.println("MSSV: "+mssv3+" -> "+mssv3.matches("[A-Z]{2}\\d{6}"));


        // 2. Kiểm tra số điện thoại VN: bắt đầu bằng 0 hoặc +84,
        // theo sau 9 chữ số (nếu bắt đầu bằng +84 thì 9 chữ số này không bắt đầu bằng 0).
        String sdt1 = "0123456789";
        String sdt2 = "+84123456789";
        String sdt3 = "1234567899";
        String sdt4 = "1234544";
        String sdt5 = "+84012345678";
        System.out.println("\n2. Kiểm tra số điện thoại VN: bắt đầu bằng 0 hoặc +84, theo sau 9 chữ số (nếu bắt đầu bằng +84 thì 9 chữ số này không bắt đầu bằng 0).");
        System.out.println(sdt1+" :"+sdt1.matches("^(0|\\+84)[1-9]\\d{8}$"));
        System.out.println(sdt2+" :"+sdt2.matches("^(0|\\+84)[1-9]\\d{8}$"));
        System.out.println(sdt3+" :"+sdt3.matches("^(0|\\+84)[1-9]\\d{8}$"));
        System.out.println(sdt4+" :"+sdt4.matches("^(0|\\+84)[1-9]\\d{8}$"));
        System.out.println(sdt5+" :"+sdt5.matches("^(0|\\+84)[1-9]\\d{8}$"));

        // 3. Kiểm tra ngày dạng dd/MM/yyyy (chỉ cần đúng hình dạng, chưa cần kiểm tra ngày có tồn tại thật hay không).
        System.out.println("/n3. Kiểm tra ngày dạng dd/MM/yyyy (chỉ cần đúng hình dạng, chưa cần kiểm tra ngày có tồn tại thật hay không).");
        String date1 = "31/10/2026";
        String date2 = "1/2/206";
        String date3 = "31-12-206";
        String date4 = "111/221/20006";
        System.out.println(date1+": "+date1.matches("^(\\d{2})/(\\d{2})/(\\d{4})$"));
        System.out.println(date2+": "+date2.matches("^(\\d{2})/(\\d{2})/(\\d{4})$"));
        System.out.println(date3+": "+date3.matches("^(\\d{2})/(\\d{2})/(\\d{4})$"));
        System.out.println(date4+": "+date4.matches("^(\\d{2})/(\\d{2})/(\\d{4})$"));

        // 4. Viết một hàm boolean isValid(String input, String regex) rồi dùng nó để test cả 3 yêu cầu trên
        // với ít nhất 1 chuỗi đúng và 1 chuỗi sai cho mỗi yêu cầu.
        System.out.println("\n4. Viết một hàm boolean isValid(String input, String regex) rồi dùng nó để test cả 3 yêu cầu trên với ít nhất 3 chuỗi đúng và 3 chuỗi sai cho mỗi yêu cầu.");
        // cau 1.
        System.out.println("cau1");
        System.out.println(mssv1+": "+isValid(mssv1, "[A-Z]{2}\\d{6}"));
        System.out.println(mssv2+": "+isValid(mssv2, "[A-Z]{2}\\d{6}"));
        System.out.println(mssv3+": "+isValid(mssv3, "[A-Z]{2}\\d{6}"));

        // cau 2.
        System.out.println("\ncau2");
        System.out.println(sdt1+": "+isValid(sdt1, "^(0|\\+84)[1-9]\\d{8}$"));
        System.out.println(sdt2+": "+isValid(sdt2, "^(0|\\+84)[1-9]\\d{8}$"));
        System.out.println(sdt3+": "+isValid(sdt3, "^(0|\\+84)[1-9]\\d{8}$"));

        // cau3
        System.out.println("\ncau3");
        System.out.println(date1+": "+isValid(date1, "^(\\d{2})/(\\d{2})/(\\d{4})$"));
        System.out.println(date2+": "+isValid(date2, "^(\\d{2})/(\\d{2})/(\\d{4})$"));
        System.out.println(date3+": "+isValid(date3, "^(\\d{2})/(\\d{2})/(\\d{4})$"));
        
    }
}