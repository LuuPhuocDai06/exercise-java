public class Developer extends Employee{
    private double overtimeHours;
    private double rate;

    public Developer(){super();}
    public Developer(double overtimeHours, double rate){
        super();
        super.setName("Nguyễn Văn B - Developer");
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
