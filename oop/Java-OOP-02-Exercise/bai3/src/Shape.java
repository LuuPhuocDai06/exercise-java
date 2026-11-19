public class Shape {
    private String name;

    public Shape(){}
    public Shape(String name){
         this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double area(){
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Hình %s với diện tích = %.2f", name, area());
    }
}
