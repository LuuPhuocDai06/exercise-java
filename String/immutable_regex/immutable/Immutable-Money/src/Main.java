import java.util.ArrayList;
import java.util.List;

public class Main {
    // hàm main.
    public static void main(String[] args){
        Money m1 = new Money(100000, "VND");
        Money m2 = m1.add(new Money(100000, "VND"));
        Money m3 = m2.subtract(new Money(50000, "VND"));
        Money m4 = m3.multiply(2);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);

        List<Money> listMoney = new ArrayList<>();
        listMoney.add(m1);
        listMoney.add(m2);
        listMoney.add(m3);
        listMoney.add(m4);

        System.out.println("\nTong giao dich: "+Money.sum("VND", listMoney));


        Money m5 = new HackedMoney(100000, "VND");
        Money m6 = m5.add(new Money(10, "VND"));
        System.out.println(m5);
        System.out.println(m6);
    }
}