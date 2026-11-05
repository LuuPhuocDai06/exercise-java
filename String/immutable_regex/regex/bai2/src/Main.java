public class Main {
    // hàm main.
    public static void main(String[] args){
        String s1 = "abc123def45";
        String s2 = "Java    la   ngon   ngu   hay";

        // 1. Dùng replaceAll để xóa tất cả chữ số khỏi s1.
        System.out.println("1. Dùng replaceAll để xóa tất cả chữ số khỏi s1.");
        System.out.println("chuỗi ban đầu: "+s1);
        System.out.println("Chuỗi sau khi dùng replaceAlln để xóa chữ số ra: "+s1.replaceAll("\\d+", ""));

        // 2. Dùng replaceAll để biến nhiều khoảng trắng liên tiếp trong s2 thành đúng 1 khoảng trắng.
        System.out.println("\n2. Dùng replaceAll để biến nhiều khoảng trắng liên tiếp trong s2 thành đúng 1 khoảng trắng.");
        System.out.println("Chuỗi ban đầu: "+s2);
        System.out.println("Chuỗi sau khi xóa khoảng trắng thừa: "+s2.replaceAll("\\s+", " "));

        // 3. Dùng trim() kết hợp regex để chuẩn hóa chuỗi "   Xin   chao   ban   " (bỏ khoảng trắng đầu, cuối và thừa ở giữa).
        System.out.println("\n3. Dùng trim() kết hợp regex để chuẩn hóa chuỗi \"   Xin   chao   ban   \" (bỏ khoảng trắng đầu, cuối và thừa ở giữa).");
        String s3 = "      Xin   chao   ban   ";
        System.out.println("Chuỗi sau khi chuẩn hóa: "+s3.replaceAll("\\s+", " ").trim());

        // 4. Trả lời: replaceAll và replaceFirst khác nhau thế nào? Cho ví dụ.
        // => replaceAll là thay tất cả các chuỗi ta yêu cầu bằng cái ta muốn còn replaceFirst chỉ thay thế ở đoạn đầu thôi.
        // Dưới là hai vd.
        System.out.println("\n4. Chuỗi sau khi dùng replaceAll: "+s3.replaceAll("\\s+", ""));
        System.out.println("Chuỗi sau khi dùng replaceFirst: "+s3.replaceFirst("\\s+", ""));

    }
}