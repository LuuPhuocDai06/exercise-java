public class Main {
    // hàm main.
    public static void main(String[] args){
        C c = new C();
        // Nếu không dùng super và truyền tham số name vào thì sẽ lỗi biên dịch
        // Lớp B kế thừa từ lớp A và từ cái constructor của A nhưng vì A thêm tham số vào
        // mà lớp B thì không có thay đổi theo thì lớp B sẽ kh tìm thấy cái nào khớp cả
        // cách sửa là truyen tham số vào super rồi lúc đó lớp B mới thay khớp với cái
        // constructor của lớp A.
    }
}