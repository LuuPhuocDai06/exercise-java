import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    // hàm main.
    public static void main(String[] args){
        String text = "Java la Ngon ngu lap trinh. Python cung Rat pho bien. Go ra doi nam 2009.";

        // 1. Dùng Pattern/Matcher đếm số từ trong text.
        System.out.println("1. Dùng Pattern/Matcher đếm số từ trong text.");
        Matcher count_text = Pattern.compile("([a-zA-Z])+").matcher(text);
        int count = 0;
        while (count_text.find()){
            count++;
        }
        System.out.println("Số từ xuất hiện trong chỗi text: "+count);
        System.out.println("Thuoc nhom: "+count_text.groupCount());
        // groupCount nó gộp chung các kiểu regex thành một nhóm như nhóm trên gồm các ký tự đơn lẻ gộp chung thành nhóm 1.


        // 2. In ra tất cả từ bắt đầu bằng chữ hoa.
        System.out.println("\n2. In ra tất cả từ bắt đầu bằng chữ hoa.");
        Matcher findTextToUpper = Pattern.compile("\\b[A-Z]\\w*").matcher(text);
        System.out.println("Các từ bắt đầu bằng chữ in hoa.");
        while (findTextToUpper.find()){
            System.out.print(findTextToUpper.group()+" ");
        }


        // 3. Tìm và in ra tất cả số trong text.
        System.out.println("\n\n3. Tìm và in ra tất cả số trong text.");
        Matcher findNumber = Pattern.compile("\\d+").matcher(text);
        while (findNumber.find()){
            System.out.print(findNumber.group()+" ");
        }


        // 4. Dùng Pattern.CASE_INSENSITIVE để đếm số lần xuất hiện của từ java bất kể hoa thường trong một đoạn văn tự chọn.
        System.out.println("\n\n4. Dùng Pattern.CASE_INSENSITIVE để đếm số lần xuất hiện của từ java bất kể hoa thường trong một đoạn văn tự chọn.");
        Matcher findJava = Pattern.compile("java", Pattern.CASE_INSENSITIVE).matcher(text);
        int countJava = 0;
        while (findJava.find()){
            countJava++;
        }
        System.out.println("Tổng số chữ java xuất hiện là: "+countJava);


    }
}