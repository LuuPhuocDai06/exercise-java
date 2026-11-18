import java.util.Objects;

public class Diem {
    // cac thuoc tinh.
    private double x;
    private double y;

    // constructor.
    public Diem(){}
    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // getter va setter.
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    // Ham tinh khoang cach giua hai diem.
    public double distanceX_Y(Diem other){
        double x1 = Math.pow(Math.abs(this.x - other.x), 2);
        double x2 = Math.pow(Math.abs(this.y - other.y), 2);
        return Math.round(Math.sqrt(x1 + x2) * 100) / 100.0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Diem diem = (Diem) o;
        return Double.compare(x, diem.x) == 0 && Double.compare(y, diem.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
