public class Main{
    //  hàm main.
    public static void main(String[] args){
        String name = "Lan";
        int age = 19;
        double gpa = 3.8765;
        System.out.println(String.format("Sinh viên %s | %d tuổi | GPA: %.2f", name, age, gpa));
        System.out.printf("Sinh viên %s | %d tuổi | GPA: %.2f", name, age, gpa);
    }
}