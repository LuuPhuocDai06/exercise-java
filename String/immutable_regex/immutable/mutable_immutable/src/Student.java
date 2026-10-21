import java.util.Objects;

public final class Student {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        if (age <= 6 || age >= 150) throw new IllegalArgumentException("Tuổi phải lớn hơn hoặc bằng 6");
        this.name = Objects.requireNonNull(name, "Tên không được để trống!").trim().toLowerCase();
        if (this.name.isEmpty()) throw new IllegalArgumentException("Tên trống!");
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student withAge(int age){
        return new Student(getName(), age);
    }

    public Student withName(String name){
        return new Student(name, getAge());
    }
}

// vì sao phải final class vì nếu không final thì class nó sẽ có thể kế thừa ->> thay đổi nên sẽ phá vỡ quy tắc immutable