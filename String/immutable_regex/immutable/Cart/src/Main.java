import java.util.List;

public class Main {
    // hàm main.
    public static void main(String[] args){
        Cart c0 = new Cart("VND");
        Cart c1 = c0.add("BUT", 2, new Money(10000, "VND"));   // dòng mới: BUT x2
        Cart c2 = c1.add("BUT", 3, new Money(10000, "VND"));   // đã có BUT: cộng dồn -> x5
        Cart c3 = c2.add("VO", 1, new Money(25000, "VND"));    // dòng mới: VO x1

        System.out.println(c0.getLines().size());   // 0   (giỏ gốc không đổi)
        System.out.println(c1.getLines().size());   // 1
        System.out.println(c2.getLines().size());   // 1   (vẫn một dòng, qty = 5)
        System.out.println(c3.getLines().size());   // 2
        System.out.println(c3.total());             // 5 x 10000 + 25000 = 75000
    }
}