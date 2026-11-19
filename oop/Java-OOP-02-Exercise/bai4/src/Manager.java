public class Manager extends Employee{
    private double bonus;

    public Manager(){super();}
    public Manager(String name, double baseSalary, double bonus){
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }


    @Override
    public double salary() {
        return super.salary() + bonus;
    }
}
