public class Main {
    public static void main(String[] args){
        // San pham ca rot voi so luong mua la 40.
        SanPham sp1 = new SanPham("ca rot", 2000.0, 40);

        // Hoa don voi so luong mua la 40.
        HoaDon hd1 = new HoaDon(sp1, 40);

        // in bill.
        System.out.println(hd1.toString());

        // check so luong ton kho.
        System.out.println("So luong ton kho cua "+sp1.getProductName()+": "+sp1.getUnitsInStock());

        // thanh toan.
        System.out.println("Thanh toan hoa don.");
        hd1.payment();


        // San pham ca rot voi so luong mua la 40.
        SanPham sp2 = new SanPham("Cu toi", 1000.0, 40);

        // Hoa don voi so luong mua la 60.
        HoaDon hd2 = new HoaDon(sp2, 60);

        // in bill.
        System.out.println(hd2.toString());

        // check so luong ton kho.
        System.out.println("So luong ton kho cua "+sp2.getProductName()+": "+sp2.getUnitsInStock());

        // thanh toan.
        System.out.println("Thanh toan hoa don.");
        hd2.payment();
    }
}