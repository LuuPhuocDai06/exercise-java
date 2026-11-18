public class Main {
    // hàm main.
    static void main(String[] args){
        Rectangle hcn1 = new Rectangle(20, 10);
        Rectangle hcn2 = new Rectangle(20.5, 12.1);
        Rectangle hcn3 = new Rectangle(10.12, 5.5);

        System.out.printf("Rộng = %.2f và dài = %.2f => Diện tích hình cn = %.2f\n",hcn1.getWidth(), hcn1.getHeight(), hcn1.getArea());
        System.out.printf("Rộng = %.2f và dài = %.2f => Chu vi hình cn = %.2f\n\n",hcn1.getWidth(), hcn1.getHeight(), hcn1.getPerimeter());

        System.out.printf("Rộng = %.2f và dài = %.2f => Diện tích = %.2f\n",hcn2.getWidth(), hcn2.getHeight(), hcn2.getArea());
        System.out.printf("Rộng = %.2f và dài = %.2f => Chu vi hình cn = %.2f\n\n",hcn2.getWidth(), hcn2.getHeight(), hcn2.getPerimeter());

        System.out.printf("Rộng = %.2f và dài = %.2f => Diện tích = %.2f\n",hcn3.getWidth(), hcn3.getHeight(), hcn3.getArea());
        System.out.printf("Rộng = %.2f và dài = %.2f => Chu vi hình cn = %.2f\n\n",hcn3.getWidth(), hcn3.getHeight(), hcn3.getPerimeter());
    }
}