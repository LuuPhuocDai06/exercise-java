public class Manager extends Employee{
    private double bonus;

    public Manager(){super();}
    public Manager(double bonus){
        super();
        super.setName("Nguyễn Văn A - Manager");
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
