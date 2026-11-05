import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    // hàm main.
    public static void main(String[] args){
        String text = "Java la Ngon ngu lap trinh. Python cung Rat pho bien. Go ra doi nam 2009.";

        // 1. Dùng Pattern/Matcher đếm số từ trong text.
        System.out.println("1. Dùng Pattern/Matcher đếm số từ trong text.");
        Matcher count_text = Pattern.compile("\\d+").matcher(text);
        System.out.println(count_text.groupCount());
        if (count_text.find()){
            System.out.println(count_text.group());
        }
    }
}