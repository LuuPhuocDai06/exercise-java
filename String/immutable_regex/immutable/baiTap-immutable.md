# Bài tập Immutable trong Java

## Bài 1 (cơ bản): Biến class mutable thành immutable

```java
public class Student {
    private String name;
    private int age;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
```

**Yêu cầu:**

1. Viết lại thành immutable, có validate (tên không rỗng, tuổi từ 0 đến 150).
2. Thay `setAge` bằng `withAge(int age)` trả về `Student` mới, và làm tương tự với `withName`.
3. Thêm `equals`, `hashCode`, `toString`.
4. Trả lời: vì sao `final class` là cần thiết? Nếu bỏ `final`, kẻ tấn công làm được gì?

## Bài 2 (cơ bản+): Defensive copy với mảng và `Date`

```java
public final class Exam {
    private final String subject;
    private final int[] scores;
    private final Date date;
    // constructor nhận (String, int[], Date)
}
```

**Yêu cầu:**

1. Viết constructor và getter sao cho immutable thật sự (copy khi vào và copy khi ra).
2. Viết test chứng minh: sửa mảng/Date gốc sau khi tạo `Exam` thì `Exam` không đổi, và sửa kết quả từ getter cũng không ảnh hưởng `Exam`.
3. Đổi `Date` sang `LocalDate`. Còn cần copy `Date` nữa không? Vì sao?
4. Trả lời: `int[]` có cần copy khi trả ra không, hay có cách trả về an toàn hơn (ví dụ `getScore(int index)`)?

## Bài 3 (trung bình): Collection và deep immutability

```java
public final class Order {
    private final String id;
    private final List<Item> items;   // Item là class có setter: setName, setPrice
}
```

**Yêu cầu:**

1. Làm `Order` immutable bằng `List.copyOf(...)` ở constructor.
2. Viết thử một bản khác dùng `Collections.unmodifiableList(items)`. Tìm một kịch bản mà bản này vẫn bị phá, và giải thích khác biệt giữa **view** và **copy**.
3. Phát hiện lỗ hổng thứ hai: `Item` vẫn mutable nên `order.getItems().get(0).setPrice(0)` vẫn sửa được. Hãy sửa bằng cách làm `Item` immutable (đây là deep immutability).
4. Thêm `Order addItem(Item item)` và `Order removeItem(String itemName)` trả về `Order` mới.

## Bài 4 (trung bình+): Nâng cấp `Money` của bạn

Làm trực tiếp trên `Money.java`:

1. Chuẩn hóa currency trong constructor (`trim().toUpperCase()`), bỏ `equalsIgnoreCase`, kiểm tra null bằng `Objects.requireNonNull`.
2. Dùng `Math.addExact` và `Math.multiplyExact` để bắt tràn số. Viết test cộng hai `Money(Long.MAX_VALUE, "VND")`.
3. Đổi tên thành `subtract` và `multiply`. Hỏi: `multiply(0)` có nên hợp lệ không?
4. Thêm `compareTo` (implements `Comparable<Money>`), ném lỗi nếu khác currency.
5. Thêm `static Money zero(String currency)` và `Money sum(List<Money>)`.
6. Thử bỏ `final` khỏi class và viết một subclass `HackedMoney` ghi đè `getAmount()` trả về giá trị tùy ý. Quan sát `add` và `subtract` hỏng ra sao khi chúng gọi `getAmount()`.

## Bài 5 (nâng cao): `Cart` immutable, record và thread-safety

**Phần A.** Viết `Cart` immutable gồm `List<CartLine>` với `CartLine(String sku, int qty, Money unitPrice)`:

- `add(sku, qty, price)`: nếu đã có sku thì cộng dồn số lượng, ngược lại thêm dòng mới.
- `remove(sku)`, `total()` trả về `Money`.
- Mọi thao tác trả về `Cart` mới và không đổi `Cart` cũ.

**Phần B.** Viết lại `CartLine` và `Money` bằng `record`.

- Compact constructor để validate.
- Chỉ ra điều gì xảy ra nếu một record có component kiểu `List<String>` mà không copy. Record có tự bảo vệ bạn không?

**Phần C.** Kiểm chứng thread-safety. Tạo một `Cart` dùng chung cho 8 thread. Mỗi thread gọi `add` nhiều lần và lưu `Cart` mới của riêng nó. Chứng minh `Cart` gốc không đổi và không cần `synchronized`. Sau đó so sánh với một bản `MutableCart` dùng `ArrayList` để thấy lỗi.

**Phần D (suy nghĩ).** Mỗi lần `add` đều copy cả list, vậy chi phí là bao nhiêu? Khi nào immutable trở nên đắt, và có cách giảm không (gợi ý: Builder, hoặc persistent data structure)?
