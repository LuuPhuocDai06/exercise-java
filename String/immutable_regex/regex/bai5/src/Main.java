import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //1. Viết regex kiểm tra email dạng ten@domain.xyz: tên gồm chữ, số, ., _; domain có thể có nhiều cấp như mail.gmail.com.
    // hàm check mail.
    public static Boolean isVaildMail(String input){
        Pattern mail = Pattern.compile("[\\w.]+@(mail|gmail|mail.gmail)\\.(com|vn)");
        Matcher regex_mail = mail.matcher(input);
        if (regex_mail.matches()){
            return true;
        }
        return false;
    }

    // hàm main.
    public static void main(String[] args){
        // 2. Thử với các chuỗi: dai_123@gmail.com, a.b@mail.gmail.com, @gmail.com, dai@, dai@gmail. Ghi rõ chuỗi nào đúng, chuỗi nào sai.
        System.out.println("Thử với các chuỗi: dai_123@gmail.com, a.b@mail.gmail.com, @gmail.com, dai@, dai@gmail. Ghi rõ chuỗi nào đúng, chuỗi nào sai.");
        String mail1 = "dai_123@gmail.com";
        String mail2 = "da.b@mail.gmail.com";
        String mail3 = "dai@";
        String mail4 = "dai@gmail";
        String mail5 = "@gmail.com";
        System.out.println(mail1+": "+isVaildMail(mail1));
        System.out.println(mail2+": "+isVaildMail(mail2));
        System.out.println(mail3+": "+isVaildMail(mail3));
        System.out.println(mail4+": "+isVaildMail(mail4));
        System.out.println(mail5+": "+isVaildMail(mail5));

        // 3. Dùng Pattern/Matcher với find() để tìm tất cả email trong đoạn văn: "Lien he a@x.com hoac b.c@mail.vn de duoc ho tro".
        System.out.println("\nCâu 3.");
        String text = "Lien he a@x.com hoac b.c@mail.vn de duoc ho tro";
        Matcher findMail = Pattern.compile("[\\w.]+@(mail|gmail|mail.gmail)\\.(com|vn)").matcher(text);
        System.out.println("find(): "+findMail.find());


        // 4. Trả lời: khác biệt giữa matches() và find() của Matcher là gì? Khi nào dùng cái nào?
        // Dựa vào các vd dụ dưới ta sẽ thấy khác biệt
        System.out.println("\n4. Sự khác biệt giữa find() và matches().");
        System.out.println("Đối với chuỗi ký tự dài và phân bố ngẫu nhiên.");
        Matcher Mail1 = Pattern.compile("[\\w.]+@(mail|gmail|mail.gmail)\\.(com|vn)").matcher(text);
        System.out.println("Dùng find() :"+Mail1.find());
        System.out.println("Dùng matches(): "+text.matches("[\\w.]+@(gmail|mail|mail.gmail)\\.(com|vn)"));

        System.out.println("\nĐối với một đoạn chứa cái regex đó như mail, sđt...");
        String mail = "ronaldo_0101@gmail.com";
        Matcher Mail2 = Pattern.compile("[\\w.]+@(mail|gmail|mail.gmail)\\.(com|vn)").matcher(text);
        System.out.println(mail+" khi dùng find(): "+Mail2.find());
        System.out.println(mail+" khi dùng matches(): "+mail.matches("[\\w.]+@(mail|gmail|mail.gmail)\\.(com|vn)"));
        // Vậy sự khác biệt giữa find() và matches() là find nó tìm regex trong một chuỗi dài hoặc ds và có đánh dấu như group(1), ...
        // còn matches() nó sẽ mặc định tìm từ đến cuối chuỗi phải thỏa mã hết như tìm mail chỉ có mail thôi không bao gồm thứ khác
        // Nếu muốn check mk, số tk, mail... nói chung là một đoạn chuỗi chỉ chứa mấy cái liên quan thì dùng matches.
        // còn nếu muốn tìm kiếm tên, sđt, vật... trong một đoạn text hoặc danh sách dài thì nên dùng find nó sẽ lọc từ đầu đến cuối và lưu dùng group để xem.

    }
}