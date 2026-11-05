public class Main {
    // hàm main.
    public static void main(String[] args){
        String a = "hello";
        String b = "Hello1";
        String c = "-123";
        String d = "+45";
        String e = "12.5";

        // 1. Viết regex kiểm tra chuỗi chỉ gồm chữ cái thường (a-z), ít nhất 1 ký tự. Thử với a và b.
        System.out.println("1. Viết regex kiểm tra chuỗi chỉ gồm chữ cái thường (a-z), ít nhất 1 ký tự. Thử với a và b");
        System.out.println(a+": "+a.matches("[a-z]+"));
        System.out.println(b+": "+b.matches("[a-z]+"));

        // 2. Viết regex kiểm tra chuỗi là số nguyên (có thể có dấu - hoặc + ở đầu). Thử với c, d, e.
        System.out.println("\n2. Viết regex kiểm tra chuỗi là số nguyên (có thể có dấu - hoặc + ở đầu). Thử với c, d, e.");
        System.out.println(c+" :"+c.matches("[-+]\\d+"));
        System.out.println(d+" :"+d.matches("[-+]\\d+"));
        System.out.println(e+" :"+e.matches("[-+]\\d+"));

        // Trả lời: vì sao "abc123".matches("\\d+") trả về false dù trong chuỗi có chữ số?
        // ->  vì \\d+ là có ít nhất 1 số nguyên mà trong chuỗi trên nó chứa chữ cái nên -> false.
    }
}