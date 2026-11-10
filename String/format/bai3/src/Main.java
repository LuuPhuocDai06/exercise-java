public class Main {
    // hàm main.
    public static void main(String[] args){
        // a) Cho double ratio = 85.67;. In ra Hoàn thành: 85.67%.
        System.out.printf("ratio = %.2f%%%n", 85.67);

        // b) Cố tình viết sai 3 trường hợp sau, chạy và ghi lại tên exception của từng trường hợp:
        // 1. Dùng %d với một số double.
        System.out.printf("\n%d%n: " 29.9); // %d không nhận double
        // 2. Viết %s %s nhưng chỉ truyền 1 tham số.
        System.out.printf("\n %s %s%n", "hello"); // thiếu tham số.
        // 3. Viết "Giảm 50%" mà không escape.
        System.out.println(String.format("\nGiảm 50%")); // phải là 50%% mới in ra được
    }
}