public class Main {
    // hàm main.
    public static void main(String[] args){
        Money m1 = new Money(100000, "VND");

        // so tien nap vao 100000.
        System.out.println(m1);

        m1 = m1.add(new Money(10000, "VND"));
        m1 = m1.add(new Money(100000, "VND"));
        System.out.println(m1);

        m1 = m1.substract(new Money(200000, "VND"));
        System.out.println(m1);
    }
}