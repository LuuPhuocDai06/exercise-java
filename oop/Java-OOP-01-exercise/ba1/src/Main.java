public class Main {
    // hàm main.
    public static void main(String[] args){
        Student sinhVien1 = new Student("Nguyen Van Cuu", 18);
        Student sinhVien2 = new Student();
        sinhVien2.setName("Nguyen Van Dinh");
        sinhVien2.setAge(20);
        sinhVien1.introduce();
        sinhVien2.introduce();

    }
}