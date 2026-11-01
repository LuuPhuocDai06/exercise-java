# Bài tập Regex trong Java

## Bài 1 (cơ bản): Kiểm tra chuỗi cơ bản với `matches`

```java
String a = "hello";
String b = "Hello1";
String c = "-123";
String d = "+45";
String e = "12.5";
```

**Yêu cầu:**

1. Viết regex kiểm tra chuỗi chỉ gồm **chữ cái thường** (a-z), ít nhất 1 ký tự. Thử với `a` và `b`.
2. Viết regex kiểm tra chuỗi là **số nguyên** (có thể có dấu `-` hoặc `+` ở đầu). Thử với `c`, `d`, `e`.
3. Trả lời: vì sao `"abc123".matches("\\d+")` trả về `false` dù trong chuỗi có chữ số?

## Bài 2 (cơ bản+): Thay thế với `replaceAll`

```java
String s1 = "abc123def45";
String s2 = "Java    la   ngon   ngu   hay";
```

**Yêu cầu:**

1. Dùng `replaceAll` để xóa **tất cả chữ số** khỏi `s1`.
2. Dùng `replaceAll` để biến nhiều khoảng trắng liên tiếp trong `s2` thành đúng 1 khoảng trắng.
3. Dùng `trim()` kết hợp regex để chuẩn hóa chuỗi `"   Xin   chao   ban   "` (bỏ khoảng trắng đầu, cuối và thừa ở giữa).
4. Trả lời: `replaceAll` và `replaceFirst` khác nhau thế nào? Cho ví dụ.

## Bài 3 (trung bình): Kiểm tra định dạng dữ liệu

**Yêu cầu:**

1. Kiểm tra **mã sinh viên** gồm 2 chữ cái in hoa, theo sau là 6 chữ số (ví dụ `DH123456`).
2. Kiểm tra **số điện thoại VN**: bắt đầu bằng `0` hoặc `+84`, theo sau 9 chữ số (nếu bắt đầu bằng `+84` thì 9 chữ số này không bắt đầu bằng `0`).
3. Kiểm tra **ngày** dạng `dd/MM/yyyy` (chỉ cần đúng hình dạng, chưa cần kiểm tra ngày có tồn tại thật hay không).
4. Viết một hàm `boolean isValid(String input, String regex)` rồi dùng nó để test cả 3 yêu cầu trên với ít nhất 3 chuỗi đúng và 3 chuỗi sai cho mỗi yêu cầu.

## Bài 4 (trung bình+): Cắt chuỗi với `split`

```java
String s = "Java, Python;  C++ ,Go";
```

**Yêu cầu:**

1. Dùng `split` tách `s` thành các từ sạch (bỏ dấu phẩy, chấm phẩy và khoảng trắng thừa). Kết quả mong đợi: `Java`, `Python`, `C++`, `Go`.
2. In ra số phần tử và từng phần tử của mảng kết quả.
3. Thử `"a1b22c333d".split("\\d+")` và `"a1b22c333d".split("\\d")`. Quan sát và giải thích vì sao kết quả khác nhau.
4. Trả lời: vì sao `"a.b.c".split(".")` trả về mảng rỗng, còn muốn tách theo dấu chấm phải viết thế nào?

## Bài 5 (khá): Email và `Pattern`/`Matcher`

**Yêu cầu:**

1. Viết regex kiểm tra **email** dạng `ten@domain.xyz`: tên gồm chữ, số, `.`, `_`; domain có thể có nhiều cấp như `mail.gmail.com`.
2. Thử với các chuỗi: `dai_123@gmail.com`, `a.b@mail.gmail.com`, `@gmail.com`, `dai@`, `dai@gmail`. Ghi rõ chuỗi nào đúng, chuỗi nào sai.
3. Dùng `Pattern`/`Matcher` với `find()` để **tìm tất cả email** trong đoạn văn: `"Lien he a@x.com hoac b.c@mail.vn de duoc ho tro"`.
4. Trả lời: khác biệt giữa `matches()` và `find()` của `Matcher` là gì? Khi nào dùng cái nào?

## Bài 6 (khá+): Xử lý văn bản

```java
String text = "Java la Ngon ngu lap trinh. Python cung Rat pho bien. Go ra doi nam 2009.";
```

**Yêu cầu:**

1. Dùng `Pattern`/`Matcher` **đếm số từ** trong `text`.
2. In ra tất cả từ **bắt đầu bằng chữ hoa**.
3. Tìm và in ra tất cả **số** trong `text`.
4. Dùng `Pattern.CASE_INSENSITIVE` để đếm số lần xuất hiện của từ `java` bất kể hoa thường trong một đoạn văn tự chọn.

## Bài 7 (nâng cao): Mật khẩu mạnh với lookahead

**Yêu cầu:**

1. Kiểm tra **mật khẩu mạnh**: ít nhất 8 ký tự, có ít nhất 1 chữ hoa, 1 chữ thường, 1 chữ số, 1 ký tự đặc biệt (gợi ý: tìm hiểu *lookahead* `(?=.*...)`).
2. Viết test với ít nhất 5 mật khẩu yếu, mỗi cái thiếu đúng một điều kiện, và 2 mật khẩu mạnh.
3. Trả lời: lookahead `(?=...)` hoạt động thế nào? Vì sao nó "nhìn trước mà không tiêu thụ ký tự"?

## Bài 8 (nâng cao+): Phân tích log bằng nhóm có tên

```java
String log = "2026-10-31 ERROR User=dai Code=404";
```

**Yêu cầu:**

1. Dùng **nhóm có tên** `(?<name>...)` để tách ra: ngày, mức độ (`ERROR`), user và mã lỗi.
2. In ra từng thành phần bằng `matcher.group("tenNhom")`.
3. Mở rộng: cho một danh sách nhiều dòng log (mức độ có thể là `INFO`, `WARN`, `ERROR`). Đọc từng dòng, chỉ in ra các dòng `ERROR` kèm user và mã lỗi.
4. Trả lời: nhóm có tên và nhóm đánh số `group(1)`, `group(2)` khác nhau thế nào? Vì sao nhóm có tên dễ bảo trì hơn?
