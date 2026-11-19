import javax.print.attribute.standard.NumberUp;
import java.text.NumberFormat;
import java.util.Locale;

public class Employee {
    private String name;
    private double baseSalary;

    public Employee(){}
    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
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
        Locale us = Locale.US;
        NumberFormat fmus = NumberFormat.getCurrencyInstance(us);
        return String.format("Tên: %s - Lương cơ bản: %s - Lương/tháng: %s", name, fmus.format(baseSalary), fmus.format(salary()));
    }
}
