# Bài tập: Class, Object, Constructor, Encapsulation

Làm từ câu 1 đến câu 5, độ khó tăng dần.

## Câu 1 (Cơ bản)

Tạo class `Student` có thuộc tính `name` và `age`, một constructor nhận 2 giá trị, và phương thức `introduce()` in ra: `Tôi là ..., ... tuổi`.
Trong `main`, tạo 2 object khác nhau và gọi `introduce()` cho từng object.

## Câu 2 (Cơ bản)

Tạo class `Rectangle` có `width`, `height` và hai phương thức `getArea()`, `getPerimeter()`.
Tạo 3 hình chữ nhật với kích thước khác nhau và in diện tích, chu vi của từng hình.

## Câu 3 (Trung bình)

Sửa class `Student` ở câu 1:
- Đặt các thuộc tính là `private`, thêm getter/setter.
- Trong `setAge`, chỉ chấp nhận tuổi từ 1 đến 100. Nếu sai thì in thông báo lỗi và giữ nguyên tuổi cũ.
- Thử gán `student.age = -5` trong `main` và quan sát lỗi biên dịch.

## Câu 4 (Khá)

Tạo class `Product` có `name`, `price`, `quantity` (đều `private`) với 2 constructor:
- Một constructor nhận đủ 3 tham số.
- Một constructor chỉ nhận `name` và `price`, cho `quantity = 0`.

Thêm phương thức `getTotalValue()` (giá x số lượng). `price` và `quantity` không được âm, nếu truyền sai thì không cho gán.

## Câu 5 (Nâng cao)

Viết class `BankAccount` đầy đủ (`owner`, `balance` là `private`) gồm:
- Constructor, getter, `deposit(double amount)`, `withdraw(double amount)` có kiểm tra hợp lệ.
- Phương thức `transfer(BankAccount to, double amount)` chuyển tiền sang tài khoản khác, đảm bảo số dư không bao giờ âm.

Trong `main`, tạo 2 tài khoản, thực hiện vài giao dịch (cả hợp lệ và không hợp lệ) rồi in số dư để kiểm tra.
