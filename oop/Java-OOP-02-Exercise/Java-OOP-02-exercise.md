# Java OOP 02 — Bài tập Kế thừa (từ cơ bản đến nâng cao)

Mỗi bài tạo file riêng trong `oop/Java-OOP-02-exercise/bai1` ... `bai5`, có `main` để tự test.

## Bài 1 (Cơ bản) — Animal / Dog / Cat
- `Animal` có `name`, method `makeSound()` in "..." .
- `Dog` và `Cat` kế thừa, override `makeSound()`.
- Trong `main` tạo 1 Dog, 1 Cat, gọi `makeSound()`.
- Yêu cầu: dùng `@Override`, constructor con gọi `super(name)`.

## Bài 2 (Cơ bản+) — Thứ tự constructor
- Tạo 3 lớp `A <- B <- C`, mỗi constructor in ra tên lớp.
- Chạy `new C()` và **dự đoán trước** thứ tự in, rồi so với kết quả.
- Thêm một tham số vào constructor của `A` (bỏ constructor mặc định) → quan sát lỗi, sửa bằng `super(...)`.

## Bài 3 (Trung bình) — Shape
- `Shape` có `name`, method `area()` trả `0` và `toString()`.
- `Rectangle(width, height)`, `Circle(radius)`, `Square` kế thừa **từ `Rectangle`** (gọi `super(side, side)`).
- Override `area()` ở từng lớp; `toString()` ở lớp cha in `name + area`.
- Tạo mảng `Shape[]` gồm các hình, duyệt in diện tích, tính tổng.

## Bài 4 (Khá) — Hệ thống nhân viên
- `Employee` (name, baseSalary, `salary()`), `Manager` (+bonus), `Developer` (+overtimeHours × rate), `Intern` (lương = 50% baseSalary).
- Override `salary()` và `toString()` hợp lý, dùng `super.salary()` khi phù hợp.
- Viết `static double totalPayroll(Employee[] list)` và tìm nhân viên lương cao nhất.
- Fields để `private`/`protected` đúng chỗ, dùng getter.

## Bài 5 (Khá+) — Đa hình
- Dùng lại `Animal/Dog/Cat` ở bài 1, thêm `Bird` (có thêm method riêng `fly()`).
- Tạo `Animal[]` chứa nhiều con, vòng `for` gọi `makeSound()` (quan sát đa hình).
- Trong vòng lặp, dùng `instanceof` để chỉ gọi `fly()` với Bird.
- Thử cố tình gọi `animals[0].fly()` không ép kiểu → đọc lỗi biên dịch. Thử ép kiểu sai (Cat thành Dog) → quan sát `ClassCastException`, rồi sửa bằng `instanceof`.

## Bài 6 (Nâng cao) — Thanh toán đa hình
- `Payment` có `amount` và `pay()` in "Processing payment".
- `CashPayment`, `CardPayment` (+ phí 2%), `EWalletPayment` (+ phí cố định) kế thừa và override `pay()` / `totalCost()`.
- Viết `static double checkout(Payment[] payments)` trả tổng tiền; **không dùng `instanceof`** trong hàm này.
- Thêm một loại thanh toán mới `CryptoPayment` mà **không sửa dòng nào** trong `checkout`. Viết 2-3 dòng giải thích vì sao làm được (đó chính là lợi ích của đa hình).

## Câu hỏi tự kiểm tra
1. `super(...)` phải nằm ở đâu trong constructor?
2. Override khác overload ở điểm nào?
3. Vì sao `String` không thể bị kế thừa?
4. Method `static` có override được không?
5. `Animal a = new Dog();` thì `a.eat()` chạy bản của lớp nào, và vì sao?
6. Khi nào cần `instanceof`, và nếu quên thì chuyện gì xảy ra?
