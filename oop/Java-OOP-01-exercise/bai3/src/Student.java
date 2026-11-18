public class Student {
    // các field.
    private String name;
    private int age;

    // Constructor.
    public Student(){}
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 100) {
            throw new IllegalArgumentException("tuổi không hợp lệ");
        }else {
            this.age = age;
        }
    }

    // method introduce.
    public void introduce(){
        System.out.println("Tôi tên là "+name+", tôi năm nay "+age+" tuổi");
    }
}
