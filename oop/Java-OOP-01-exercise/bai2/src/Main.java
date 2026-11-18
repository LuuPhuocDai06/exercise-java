public class Main {
    // hàm main.
    static void main(String[] args){
        Rectangle hcn1 = new Rectangle(20, 10);
        Rectangle hcn2 = new Rectangle(20.5, 12.1);
        Rectangle hcn3 = new Rectangle(10.12, 5.5);

        hcn1.getArea();
        hcn1.getPerimeter();

        hcn2.getArea();
        hcn2.getPerimeter();

        hcn3.getArea();
        hcn3.getPerimeter();
    }
}