public class Main {
    // ham main.
    public static void main(String[] args){
        HinhChuNhat hcn1 = new HinhChuNhat(5.4, 7.8);
        HinhChuNhat hcn2 = new HinhChuNhat(5.0, 5.0);
        HinhChuNhat hcn3 = new HinhChuNhat(10.0, 15.0);

        // Xuat thong tin.
        System.out.println("Thong tin cua cac hinh chu nhat.");
        System.out.println(hcn1);
        System.out.println(hcn2);
        System.out.println(hcn3);
    }
}