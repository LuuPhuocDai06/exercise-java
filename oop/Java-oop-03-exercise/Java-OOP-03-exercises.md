# Java OOP 03 – Bài tập: Interface, Abstract Class, Default Method

6 bài, **dễ → khó**, mỗi bài dùng lại kết quả của bài trước (cùng một project nhỏ: *quản lý người trong trường*). Nên làm đúng thứ tự.

Gợi ý nộp: đẩy lên `exercise-java` ở thư mục `oop/Java-OOP-03-exercise/` (bai1 … bai6), rồi gửi mình kiểm tra.

Nối với kiến thức cũ:
- `Student` (encapsulation, constructor) → bài **OOP-01**
- `extends`, `super`, override, đa hình → **T3**
- `Money` bất biến (immutable) → bài **Immutable**

---

## Bài 1 – Interface cơ bản (khởi động)

Tạo interface `Describable` có 1 method `String describe()`.

- `Student` (dùng lại bản ở OOP-01: tên, mã, điểm…) implements `Describable`.
- Tạo thêm `Teacher` (tên, môn dạy) cũng implements `Describable`.
- Trong `main`: tạo `List<Describable>` chứa cả Student và Teacher, duyệt in `describe()`.

**Kiểm tra bản thân:**
- Quên `public` ở method `describe()` trong class thì lỗi gì? Thử rồi ghi lại thông báo lỗi.
- Có viết được `Describable d = new Describable();` không? Vì sao?

---

## Bài 2 – Default method + static method

Mở rộng `Describable` của bài 1 (**không sửa gì** trong `Student` và `Teacher` lúc thêm):

- Thêm `default String shortInfo()`: trả về `describe()` cắt còn tối đa 20 ký tự và thêm `...` nếu dài hơn.
- Thêm `static void printAll(List<? extends Describable> list)` in `shortInfo()` của từng phần tử.
- Sau đó **override** `shortInfo()` trong `Teacher` để trả về dạng `"GV: " + tên`.

**Kiểm tra bản thân:**
- Vì sao thêm default method không làm `Student` bị lỗi biên dịch? Liên hệ với `List.sort()` ở Java 8.
- Gọi `Describable.printAll(...)` được, còn `student.printAll(...)` thì sao? Thử.

---

## Bài 3 – Abstract class: gom phần chung

`Student` và `Teacher` đều có `name`, `id`. Tạo `abstract class Person`:

- Field `private final String id`, `private String name` (validate: không null, không rỗng, ném `IllegalArgumentException` nếu sai) → dùng lại ý tưởng encapsulation của OOP-01.
- Constructor `protected Person(String id, String name)`.
- Method `abstract String getRole()` (Student trả `"Sinh viên"`, Teacher trả `"Giảng viên"`).
- Method thường `toString()` dựng chuỗi từ `id`, `name`, `getRole()`.
- `Student` và `Teacher` giờ `extends Person implements Describable`, gọi `super(id, name)` (nối T3).

**Viết thêm 3 dòng comment** trong code: vì sao `Person` nên là **abstract class** chứ không phải interface? (Gợi ý: nó có gì mà interface không có được?)

**Kiểm tra bản thân:** `new Person("1", "An")` báo lỗi gì?

---

## Bài 4 – Nhiều interface + xung đột default

Cho `Teacher` nhận lương. Dùng lại class `Money` bất biến bạn đã làm ở bài Immutable.

- Interface `Payable`: `Money getSalary()` và `default String info() { return "Lương: " + getSalary(); }`.
- Thêm vào `Describable` một `default String info()` trả về `describe()`.
- `Teacher extends Person implements Describable, Payable` → **sẽ lỗi biên dịch** do trùng `info()`. Hãy:
  1. Chụp lại thông báo lỗi.
  2. Sửa bằng cách override `info()` trong `Teacher`, gộp 2 phía bằng `Describable.super.info()` và `Payable.super.info()`.
- `Student` **không** implements `Payable`. Viết method `static Money totalSalary(List<? extends Payable> list)` cộng lương một danh sách (tận dụng `Money` bất biến: mỗi lần cộng ra `Money` mới).

**Kiểm tra bản thân:** Nếu `Person` (class cha) cũng có method `info()` thì khi trùng với default của interface, bên nào thắng? Thử xem.

---

## Bài 5 – Template method (abstract class nâng cao)

Làm module in báo cáo:

```java
public abstract class Report {
    public final String generate() {        // khung cố định
        return header() + "\n" + body() + "\n" + footer();
    }
    protected String header() { return "=== BÁO CÁO ==="; }
    protected abstract String body();
    protected String footer() { return "=== HẾT ==="; }
}
```

- `StudentReport extends Report`: `body()` liệt kê các `Student` (nhận `List<Student>` qua constructor), mỗi dòng một `describe()`.
- `SalaryReport extends Report`: `body()` liệt kê lương và tổng (dùng `totalSalary` ở bài 4).
- Override `header()` ở `SalaryReport` thành tiêu đề riêng.

**Kiểm tra bản thân:**
- Vì sao `generate()` để `final`? Nếu bỏ `final`, một class con có thể phá khung như thế nào?
- Vì sao `body()` là `abstract` còn `header()` thì không?
- Vì sao `Report` là abstract class mà không phải interface + default method? (Gợi ý: đề bài này không cần state, hãy suy nghĩ xem **cần thêm gì** thì abstract class mới thật sự cần thiết, ví dụ một field `title` dùng chung.)

---

## Bài 6 – Nâng cao: Interface kiểu backend (nền của Spring)

Quản lý danh sách `Student` theo kiểu 3 lớp mà bạn đã làm trong app quản lý:

1. Interface `StudentRepository`:
   - `void save(Student s)`
   - `Optional<Student> findById(String id)`
   - `List<Student> findAll()`
2. Class `InMemoryStudentRepository implements StudentRepository` (lưu bằng `HashMap<String, Student>`).
3. Class `StudentService` có constructor nhận **`StudentRepository`** (không phải `InMemoryStudentRepository`):
   - `register(Student s)`: nếu id đã tồn tại → ném exception, ngược lại `save`.
   - `getAverageScore()`: tính điểm trung bình của tất cả sinh viên.
4. Tạo thêm `FailingStudentRepository implements StudentRepository` (cố tình ném `RuntimeException` ở `save`) để **kiểm tra `StudentService` xử lý lỗi** mà không cần đụng tới `InMemory...`.
5. Viết `main` (hoặc vài test thủ công bằng hàm `check()` như bạn đã làm ở Week 1) dùng cả hai repository **mà không sửa một dòng nào trong `StudentService`**.

**Câu hỏi chốt (viết 2-3 dòng mỗi câu, có thể ghi trong comment hoặc file riêng):**

1. `StudentService` phụ thuộc vào interface thay vì class cụ thể thì có lợi gì khi muốn đổi sang lưu bằng database sau này?
2. Với mỗi tình huống, chọn **interface**, **abstract class** hay **cả hai**, và giải thích:
   - a) Các loại `Notification` (Email, SMS, Push) đều có `recipient` và `sentAt`, cần validate chung, nhưng cách gửi khác nhau.
   - b) Một số class đều "có thể export ra CSV" dù chẳng liên quan nhau.
   - c) Nhiều loại `Employee` (full-time, part-time) chung `id`, `name`, và khung tính lương, nhưng công thức khác nhau; một số còn "có thể làm thêm giờ".
3. Vì sao Spring thường viết `UserService` (interface) + `UserServiceImpl`?

---

## Checklist tự đánh giá cuối bài

- [ ] Giải thích được khác biệt **is-a** và **can-do** bằng ví dụ riêng của mình.
- [ ] Biết lý do ra đời của default method và cách giải quyết xung đột bằng `X.super.method()`.
- [ ] Biết 3 thứ abstract class có mà interface **không có** (state, constructor, protected).
- [ ] Phân biệt được tình huống dùng **interface**, **abstract class**, và **kết hợp cả hai**.
- [ ] Hiểu vì sao tầng service nên phụ thuộc vào interface của repository.
