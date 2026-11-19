public class Main {
    // hàm main.
    public static void main(String[] args){
        C c = new C();
        // Nếu không dùng super và truyền tham số name vào thì sẽ lỗi logic
        // Kiểu gọi new C() mà lớp c -> b -> a nên từ lớp b thiếu tham số truyền vào lớp cha a khi lớp a thêm một tham số.
        // Nên buộc phải super và truyền tham số vào super để truyền đến lớp cha.
    }
}