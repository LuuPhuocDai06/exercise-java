public class Employee {
    protected String name;
    private final double baseSalary = 2000;

    public Employee(){}
    public Employee(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }


    // method salary.
    public double salary(){
        return baseSalary;
    }

    // toString.
    @Override
    public String toString() {
        return String.format("Tên: %s - Lương cơ bản: %.2f - Lương/tháng: %.2f", name, baseSalary, salary());
    }
}
