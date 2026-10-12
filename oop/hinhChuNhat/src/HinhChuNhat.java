public class HinhChuNhat {
    // cac thuoc tinh.
    private double length;
    private double width;

    // cac method.
    public HinhChuNhat(){
        this.length = 0;
        this.width = 0;
    }
    public HinhChuNhat(double length, double width) {
        if(length > 0 && width > 0){
            this.width = width;
            this.length = length;
        }
    }

    // getter va setter.
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length > 0){
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0){
            this.width = width;
        }
    }

    // tinh chu vi.
    public double perimeter(){
        return (this.length + this.width) * 2;
    }

    // tinh dien tich.
    public double area(){
        return this.width * this.length;
    }

    // kiem tra hinh vuong.
    public Boolean checkSquare(){
        if(this.width == this.length){
            return true;
        }
        return false;
    }

    // toString.
    @Override
    public String toString() {
        return "\nHinh chu nhat"+
                "\nChieu dai: "+this.length+
                "\nChieu rong: "+this.width+
                "\nChu vi : "+this.perimeter()+
                "\nDien tich: "+this.area()+
                "\nKiem tra hinh vuong: "+this.checkSquare();
    }
}
