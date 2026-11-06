import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    // hàm check mật khẩu.
    public static Boolean inputPassword(String input){
        Pattern passwords = Pattern.compile("(?=.*[a-zA-Z])(?=.*\\d)(?=.*[\\p{S}\\p{P}])[a-zA-Z0-9\\p{S}\\p{P}]{8,20}");
        // \\p{S} và \\p{P} là bao gồm hết ký tự đặt biệt.
        Matcher checkpassword = passwords.matcher(input);
        return checkpassword.matches();
    }

    // hàm main.
    public static void main(String[] args){
        // 1. Kiểm tra mật khẩu mạnh: ít nhất 8 ký tự, có ít nhất 1 chữ hoa, 1 chữ thường,
        // 1 chữ số, 1 ký tự đặc biệt (gợi ý: tìm hiểu lookahead (?=.*...)).
        System.out.println("1. Kiểm tra mật khẩu mạnh: ít nhất 8 ký tự, có ít nhất 1 chữ hoa, 1 chữ thường, 1 chữ số, 1 ký tự đặc biệt (gợi ý: tìm hiểu lookahead (?=.*...)).");
        Pattern passwords = Pattern.compile("(?=.*[a-zA-Z])(?=.*\\d)(?=.*[\\p{S}\\p{P}])[a-zA-Z0-9\\p{S}\\p{P}]{8,20}");
        // \\p{S} và \\p{P} là bao gồm hết ký tự đặt biệt.
        String password = "dai782006@";
        Matcher checkpassword = passwords.matcher(password);
        if (checkpassword.matches()){
            System.out.println("password hợp lệ");
        }
        else System.out.println("password không hợp lệ");



        // 2. Viết test với ít nhất 5 mật khẩu yếu, mỗi cái thiếu đúng một điều kiện, và 2 mật khẩu mạnh.
        System.out.println("\n2. Viết test với ít nhất 5 mật khẩu yếu, mỗi cái thiếu đúng một điều kiện, và 2 mật khẩu mạnh.");
        String password1 = "nguyenVanCuu";
        String password2 = "12345678";
        String password3 = "12345678@";
        String password4 = "nguyen123";
        String password5 = "nguyenVanCuu123";
        String password6 = "nguyenVanCuu1213@";
        String password7 = "Nguyenvancuu1212#";
        System.out.println(password1+": "+inputPassword(password1));
        System.out.println(password2+": "+inputPassword(password2));
        System.out.println(password3+": "+inputPassword(password3));
        System.out.println(password4+": "+inputPassword(password4));
        System.out.println(password5+": "+inputPassword(password5));
        System.out.println(password6+": "+inputPassword(password6));
        System.out.println(password7+": "+inputPassword(password7));



        // Trả lời: lookahead (?=...) hoạt động thế nào? Vì sao nó "nhìn trước mà không tiêu thụ ký tự"?
        // nó chỉ trước nhưng mà không tiêu thụ ký tự nói cách khác là con trỏ nó chỉ đứng yên mà không trỏ đến vị trí cuối cùng vd.
        System.out.println("\n4. Trả lời: lookahead (?=...) hoạt động thế nào? Vì sao nó \"nhìn trước mà không tiêu thụ ký tự\"?");
        Matcher lookahead = Pattern.compile("abc(?=\\d+)").matcher("abc123"); // sau abc ít nhất có một chỉ số.
        System.out.println("Khi có lookahead.");
        lookahead.find();
        System.out.println(lookahead.start());
        System.out.println(lookahead.end());

        System.out.println("khi không có lookahead");
        Matcher noLookahead = Pattern.compile("abc\\d+").matcher("abc123");
        noLookahead.find();
        System.out.println(noLookahead.start());
        System.out.println(noLookahead.end());

        // vậy ta thấy con trỏ khi ta dùng lookahead thì nó chỉ đứng ở cái điều kiện tức là nó đã lướt qua nhưng con trỏ vẫn trở lại vị trí cũ.
        // còn khi không dùng lookahead thì con trỏ nó ở ví trí cuối cùng có nghĩa là nó đang tiêu hao ký tự.
        // còn về cơ chế hoạt động của nó thì tôi chịu tôi chỉ hiểu cách nó làm việc thôi.
    }
}