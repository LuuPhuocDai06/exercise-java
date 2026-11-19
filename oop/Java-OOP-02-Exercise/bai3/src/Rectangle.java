public class Rectangle extends Shape{
    // các field.
    private double width;
    private double height;

    public Rectangle(){super();}
    public Rectangle(double width, double height){
        super("chữ nhật");
        this.height = height;
        this.width = width;
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

    @Override
    public double area() {
        return super.area() + (width * height);
    }
}
