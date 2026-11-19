public class Developer extends Employee{
    private double overtimeHours;
    private double rate;

    public Developer(){super();}
    public Developer(String name, double baseSalary, double overtimeHours, double rate){
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.rate = rate;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }


    public double getRate() {
        return rate;
    }


    @Override
    public double salary() {
        return super.salary() + (overtimeHours * rate);
    }
}
