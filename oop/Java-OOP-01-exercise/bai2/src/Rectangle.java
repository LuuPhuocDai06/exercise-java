import java.security.PublicKey;

public class Rectangle {
    // các field.
    private double width;
    private double height;

    // Constructor.
    public Rectangle(){}
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // method getArea.
    public void getArea(){
        System.out.printf("Với hình chữ nhật có chiều rộng %.2f và chiều dài %.2f thì diện tích = %.2f \n",width, height, (width * height));
    }

    // method getPerimeter.
    public void getPerimeter(){
        System.out.printf("Với hình chữ nhật có chiều rộng %.2f và chiều dài %.2f thì chu vi = %.2f \n\n",width, height, (width + height)*2);
    }
}
