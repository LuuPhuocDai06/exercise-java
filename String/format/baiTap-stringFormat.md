# String format trong Java: Bài tập

Làm từ trên xuống dưới (cơ bản → nâng cao nhẹ). Mỗi bài viết một `main` riêng, chạy thử và so với kết quả mong muốn.

---

## Bài 1 (cơ bản): Chèn giá trị

Cho:

```java
String name = "Lan";
int age = 19;
double gpa = 3.8765;
```

In ra đúng dòng sau (GPA làm tròn 2 chữ số):

```
Sinh viên Lan | 19 tuổi | GPA: 3.88
```

Làm bằng cả `String.format` và `printf`.

---

## Bài 2 (cơ bản): Đệm số 0 và phân cách hàng nghìn

a) In các số `7`, `42`, `1234` thành mã 4 chữ số: `0007`, `0042`, `1234`.

b) In `9876543210` có dấu phẩy phân cách hàng nghìn: `9,876,543,210`.

c) In mã đơn hàng dạng `ORD-000042` từ số `42`.

---

## Bài 3 (cơ bản): Ký tự `%` và lỗi thường gặp

a) Cho `double ratio = 85.67;`. In ra `Hoàn thành: 85.67%`.

b) Cố tình viết sai 3 trường hợp sau, chạy và ghi lại tên exception của từng trường hợp:
- Dùng `%d` với một số `double`.
- Viết `%s %s` nhưng chỉ truyền 1 tham số.
- Viết `"Giảm 50%"` mà không escape.

---

## Bài 4 (trung bình): In bảng thẳng cột

Cho 3 sản phẩm: `Laptop` (SL 2, giá 15500000), `Chuột` (SL 10, giá 250000), `Bàn phím` (SL 5, giá 1200000).

In bảng như sau (Tên canh trái rộng 12, Số lượng canh phải rộng 5, Đơn giá canh phải rộng 14, có phân cách hàng nghìn và 2 số thập phân), kèm dòng kẻ ngang bằng ký tự `-`:

```
Tên          |   SL |       Đơn giá
--------------------------------------
Laptop       |    2 | 15,500,000.00
Chuột        |   10 |    250,000.00
Bàn phím     |    5 |  1,200,000.00
```

Gợi ý: dòng kẻ có thể tạo bằng `"-".repeat(n)`.

---

## Bài 5 (nâng cao nhẹ): Locale và tiền tệ

Viết method:

```java
static String formatMoney(long amount)
```

trả về số tiền kiểu Việt Nam, dùng dấu chấm phân cách hàng nghìn, ví dụ `formatMoney(1250000)` → `1.250.000 ₫`.

Yêu cầu:
1. In thử `String.format("%,d", 1250000)` với `Locale.US` và `Locale.GERMANY` (hoặc `Locale.of("vi", "VN")` nếu Java 19+, `new Locale("vi", "VN")` nếu cũ hơn), quan sát khác biệt.
2. Viết `formatMoney` dựa trên quan sát đó.
3. Trả lời ngắn (1-2 câu): tại sao trên server nên truyền `Locale` rõ ràng khi format số?

---

