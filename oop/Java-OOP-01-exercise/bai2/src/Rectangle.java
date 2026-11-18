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
    public double getArea(){
        return width * height;
    }

    // method getPerimeter.
    public double getPerimeter(){
        return (width + height) * 2;
    }
}
