public class Main {
    // hàm main.
    static void main(String[] args){
        Shape[] cacHinh = {new Square(20), new Rectangle(10, 5.6), new Circle(5.5)};
        double total = 0;
        for (Shape i : cacHinh){
            System.out.println(i);
            total += i.area();
        }
        System.out.printf("Total = %.2f", total);


    }
}