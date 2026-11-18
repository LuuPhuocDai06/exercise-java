public class Main {
    // hàm main.
    static void main(String[] args){
        Product p1 = new Product("bàn phím", 20000, 12);
        Product p2 = new Product("Chuột", 12000);

        p1.getTotalValue();
        p2.getTotalValue();

        p2.setPrice(-10000);
        p2.setQuantity(-10);
    }
}