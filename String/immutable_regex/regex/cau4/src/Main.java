public class Main {
    // hàm main.
    public static void main(String[] args){
        String chuoi = "Java, Python;  C++ ,Go";
        // 1. Dùng split tách s thành các từ sạch (bỏ dấu phẩy, chấm phẩy và khoảng trắng thừa). Kết quả mong đợi: Java, Python, C++, Go.
        System.out.println("1. Dùng split tách s thành các từ sạch (bỏ dấu phẩy, chấm phẩy và khoảng trắng thừa). Kết quả mong đợi: Java, Python, C++, Go.");
        String[] arr = chuoi.split("\\s*[,;]\\s*");
        int t = 1;
        for (String i : arr){
            System.out.print(i);
            if (t == arr.length){
                System.out.print(".");
            }
            else{
                System.out.print(", ");
            }
            t++;
        }

        // 2. In ra số phần tử và từng phần tử của mảng kết quả.
        System.out.println("\n\n2. In ra số phần tử và từng phần tử của mảng kết quả");
        System.out.println("Số lượng phần tử: "+arr.length);
        System.out.println("Các phần tử:");
        for (String i : arr){
            System.out.println(i);
        }


        // 3. Thử "a1b22c333d".split("\\d+") và "a1b22c333d".split("\\d"). Quan sát và giải thích vì sao kết quả khác nhau.
        System.out.println("\n3. Thử \"a1b22c333d\".split(\"\\\\d+\") và \"a1b22c333d\".split(\"\\\\d\"). Quan sát và giải thích vì sao kết quả khác nhau.");
        String s1 = "a1b22c333d";
        System.out.println("Với \\\\d+.");
        String[] chuoi1 = s1.split("\\d+");
        for (String i : chuoi1){
            System.out.print(i+"-");
        }

        System.out.println("\nVới \\\\d.");
        String[] chuoi2 = s1.split("\\d");
        for (String i : chuoi2){
            System.out.print(i+"-");
        }
        // => khác là vì \\d+ là ít nhất một chữ số trở lên còn \\d chỉ một chữ số duy nhất
        // tôi thêm cái dấu - để nhất biết mỗi bị tách cái \\d thì nó thấy có số xuất hiện là nó tách nên là cái đầu ra của nó nhiều dấu -
        // còn đối với cái \\d+ là >= 1 nên các con số ngồi gần nhau đều là >= 1 nên nó sẽ tính là một trường hợp nên chỉ in ra một dấu - duy nhất dù nhiều số đến mấy nó vẫn sẽ chỉ tách nếu sau nó là một con số với số lượng >= 1.

        // 4. Trả lời: vì sao "a.b.c".split(".") trả về mảng rỗng, còn muốn tách theo dấu chấm phải viết thế nào?
        // Nếu muốn tách bổi dấu . thì phải \\. java mới hiểu đc, còn nếu không thì nó chỉ hiểu là một cái space.
        // với lại . trong regex nghĩa là một ký tự bất kỳ bao gồm số, chữ, kt đặc biệt nên khi bạn nhập thế thì java nó kh hiểu tóm lại cần có dấu báo \\.
        // Hoặc có thể dùng cái [.] thì nó hiểu đc.
        System.out.println("\n");
        String[] ar1 = "a.b.c".split("\\.");
        for (String i : ar1){
            System.out.println(i);
        }

    }
}