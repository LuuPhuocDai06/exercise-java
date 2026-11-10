public class Main {
    // hàm main.
    public static void main(String[] args) {
        //a) In các số 7, 42, 1234 thành mã 4 chữ số: 0007, 0042, 1234.
        System.out.printf("Dùng đệm số 0 để in các số thành mã 4 số: %04d, %04d, %04d%n", 7, 42, 1234);

        //b) In 9876543210 có dấu phẩy phân cách hàng nghìn: 9,876,543,210.
        System.out.printf("\nDung dấu phẩy phân cách hàng nghìn để in số 9876543210 -> %,d%n", 9876543210L);

        //c) In mã đơn hàng dạng ORD-000042 từ số 42.
        System.out.printf("\nMã đơn hàng: ORD-%06d", 42);
    }
}