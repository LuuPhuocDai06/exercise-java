public class Main {
    // hàm main.
    public static void main(String[] args){
        // Cho 3 sản phẩm: Laptop (SL 2, giá 15500000), Chuột (SL 10, giá 250000), Bàn phím (SL 5, giá 1200000).
        // In bảng như sau (Tên canh trái rộng 12, Số lượng canh phải rộng 5, Đơn giá canh phải rộng 14,
        // có phân cách hàng nghìn và 2 số thập phân), kèm dòng kẻ ngang bằng ký tự -:
        System.out.printf("%-12s|%5s |%14s%n", "Tên", "SL", "Đơn giá");
        System.out.println("-".repeat(38));
        System.out.printf("%-12s|%5d |%,14.2f %n", "Laptop", 2, 15500000f);
        System.out.printf("%-12s|%5d |%,14.2f %n", "Chuột", 10, 250000f);
        System.out.printf("%-12s|%5d |%,14.2f %n", "Bàn phím", 5, 1200000f);
    }
}