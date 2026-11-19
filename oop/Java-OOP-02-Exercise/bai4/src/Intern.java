public class Intern extends Employee{
    public Intern()
    {
        super();
        super.setName("Nguyễn Văn C - Intern");
    }

    @Override
    public double salary() {
        return super.salary() / 2;
    }
}
