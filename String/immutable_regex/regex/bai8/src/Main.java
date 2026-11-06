import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    // hàm main.
    public static void main(String[] args){
        String log = "2026-10-31 ERROR User=dai Code=404";
        // 1. Dùng nhóm có tên (?<name>...) để tách ra: ngày, mức độ (ERROR), user và mã lỗi.
        System.out.println("1. Dùng nhóm có tên (?<name>...) để tách ra: ngày, mức độ (ERROR), user và mã lỗi.");
        Pattern name_group = Pattern.compile("(?<date>\\d{4}-\\d{2}-\\d{2})\\s+(?<error>ERROR\\b)\\s+User=(?<user>\\w+)\\s+Code=(?<code>\\d+)");
        Matcher check = name_group.matcher(log);

        // 2. In ra từng thành phần bằng matcher.group("tenNhom").
        System.out.println("\n2. In ra từng thành phần bằng matcher.group(\"tenNhom\").");
        if (check.find()){
            System.out.println("Date: "+check.group("date"));
            System.out.println("Error: "+check.group("error"));
            System.out.println("User: "+check.group("user"));
            System.out.println("Code: "+check.group("code"));
        }

        // 4. Trả lời: nhóm có tên và nhóm đánh số group(1), group(2) khác nhau thế nào? Vì sao nhóm có tên dễ bảo trì hơn?
        // việc này cũng giống như bạn xếp đồ trong tủ theo con số lúc đầu đồ ít thì có thể nhớ nhưng lâu dần đồ nhiều và cần phân loại nhiều nên tên vẫn là hợp lí hơn so với số thô sơ.
        



    }
}