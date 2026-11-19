public class Intern extends Employee{
    public Intern(String name, double baseSalary){
        super(name, baseSalary);
    }

    @Override
    public double salary() {
        return super.salary() / 2;
    }
}
