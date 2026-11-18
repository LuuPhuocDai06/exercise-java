# Bài tập OOP Java (chỉ đề bài, không kèm code)

## Mục lục

- [Mức 1: Cơ bản](#mức-1-cơ-bản) (Bài 1 - 5)
- [Mức 2: Trung cấp](#mức-2-trung-cấp) (Bài 6 - 10)
- [Mức 3: Nâng cao](#mức-3-nâng-cao) (Bài 11 - 15)

---

# Mức 1: Cơ bản

**Chủ đề:** Class, Object, Encapsulation

## Bài 1: Quản lý sinh viên

Xây dựng lớp `SinhVien` gồm mã số, họ tên, năm sinh, điểm trung bình.

- Dùng thuộc tính private với getter/setter.
- Điểm phải nằm trong khoảng 0 đến 10.
- Tạo 3 sinh viên, in thông tin và xếp loại (Giỏi, Khá, Trung bình, Yếu).

## Bài 2: Hình chữ nhật

Tạo lớp `HinhChuNhat` có chiều dài, chiều rộng.

- Cung cấp các phương thức tính chu vi, diện tích và kiểm tra hình vuông.
- Chiều dài và chiều rộng phải là số dương.
- Viết thêm constructor mặc định và constructor có tham số.

## Bài 3: Tài khoản ngân hàng đơn giản

Tạo lớp `TaiKhoan` gồm số tài khoản, tên chủ tài khoản, số dư.

- Có các chức năng nạp tiền, rút tiền (không cho rút quá số dư) và xem số dư.
- Không cho phép sửa trực tiếp số dư từ bên ngoài.

## Bài 4: Sản phẩm và giỏ hàng nhỏ

Tạo lớp `SanPham` (tên, đơn giá, số lượng tồn) và lớp `HoaDon` chứa một sản phẩm cùng số lượng mua.

- Tính thành tiền.
- Kiểm tra tồn kho trước khi bán.
- Cập nhật lại số lượng tồn sau khi bán.

## Bài 5: Điểm và khoảng cách

Tạo lớp `Diem` biểu diễn tọa độ (x, y) trong mặt phẳng.

- Viết phương thức tính khoảng cách giữa hai điểm.
- Kiểm tra hai điểm có trùng nhau không (nạp chồng phương thức `equals`).
- In điểm ra dạng chuỗi (`toString`).

---

# Mức 2: Trung cấp

**Chủ đề:** Kế thừa, Đa hình, Abstract, Interface

## Bài 6: Hệ thống nhân viên

Tạo lớp cha `NhanVien` (mã, tên, lương cơ bản) và hai lớp con `NhanVienVanPhong`, `NhanVienKinhDoanh` (có thêm doanh số và hoa hồng).

- Mỗi loại có cách tính lương riêng (override).
- Tạo danh sách hỗn hợp và in bảng lương.

## Bài 7: Hình học đa hình

Tạo lớp trừu tượng `Hinh` với phương thức trừu tượng tính diện tích và chu vi. Các lớp con: `HinhTron`, `HinhChuNhat`, `TamGiac`.

- Đưa tất cả vào một mảng kiểu `Hinh`.
- Tìm hình có diện tích lớn nhất.
- Tính tổng chu vi.

## Bài 8: Phương tiện giao thông

Tạo lớp `PhuongTien` và các lớp con `OTo`, `XeMay`, `XeDap`.

- Mỗi loại có cách tính phí gửi xe khác nhau.
- Dùng interface `CoDongCo` cho những phương tiện có động cơ (phương thức tính mức tiêu hao nhiên liệu).
- Nêu rõ phương tiện nào triển khai interface nào.

## Bài 9: Thư viện sách

Tạo lớp `TaiLieu` (mã, tên, nhà xuất bản) với các lớp con `Sach`, `TapChi`, `Bao`, mỗi lớp có thuộc tính riêng.

- Xây dựng lớp `ThuVien` quản lý danh sách tài liệu.
- Cho phép thêm, xóa, tìm theo tên và thống kê theo loại.

## Bài 10: Động vật và âm thanh

Tạo interface `BietKeu` và `BietDiChuyen`. Các lớp `Cho`, `Meo`, `Chim`, `Ca` triển khai interface phù hợp (chim biết bay, cá biết bơi, chó và mèo biết chạy).

- Tạo danh sách động vật và gọi các hành vi bằng đa hình.
- Giải thích vì sao dùng interface thay vì lớp cha ở đây.

---

# Mức 3: Nâng cao

**Chủ đề:** Thiết kế, Design Pattern, SOLID, Collections, Exception

## Bài 11: Quản lý ngân hàng hoàn chỉnh

Thiết kế hệ thống với `KhachHang`, `TaiKhoan` (tiết kiệm, thanh toán) và `GiaoDich`.

- Tự định nghĩa ngoại lệ như `SoDuKhongDuException`, `TaiKhoanKhongTonTaiException`.
- Chuyển khoản giữa hai tài khoản.
- Lưu lịch sử giao dịch.
- Thống kê theo khách hàng bằng Collections.

## Bài 12: Áp dụng Singleton và Factory

- Xây dựng hệ thống ghi log dùng Singleton (chỉ một đối tượng ghi log duy nhất trong toàn chương trình).
- Xây dựng Factory tạo ra các loại thông báo (Email, SMS, Push) từ một tham số đầu vào.
- Mô tả sơ đồ lớp và giải thích lợi ích của từng pattern.

## Bài 13: Áp dụng Strategy và Observer

Bài toán thương mại điện tử:

- Đơn hàng có nhiều cách tính phí vận chuyển và nhiều phương thức giảm giá, dùng **Strategy** để đổi thuật toán linh hoạt.
- Khi trạng thái đơn hàng thay đổi, các đối tượng như `KhachHang`, `Kho`, `KeToan` phải được tự động thông báo, dùng **Observer**.

## Bài 14: Refactor theo nguyên tắc SOLID

Đề bài mô tả một lớp `QuanLyDonHang` làm quá nhiều việc: tính tiền, lưu cơ sở dữ liệu, gửi email, in hóa đơn.

1. Chỉ ra từng nguyên tắc SOLID bị vi phạm.
2. Đề xuất cách tách lớp và interface.
3. Vẽ sơ đồ lớp trước và sau khi refactor.

## Bài 15: Dự án mini - Hệ thống quản lý đặt vé xem phim

Phân tích và thiết kế đầy đủ:

- Các đối tượng: `Phim`, `RapChieu`, `SuatChieu`, `Ghe`, `Ve`, `KhachHang`, `HoaDon`.
- Quan hệ giữa chúng (kế thừa, kết hợp, tập hợp).
- Ít nhất hai design pattern phù hợp.
- Xử lý ngoại lệ (ghế đã được đặt, suất chiếu đã hết).
- Các chức năng tìm kiếm, thống kê doanh thu.

**Sản phẩm gồm:** sơ đồ lớp UML, mô tả luồng xử lý và cài đặt hoàn chỉnh.

---

## Gợi ý cách học

- Làm hết 5 bài của mỗi mức rồi mới lên mức tiếp theo.
- Ở mức nâng cao, hãy vẽ sơ đồ lớp trước khi viết code.
