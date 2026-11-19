Câu hỏi tự kiểm tra

    super(...) phải nằm ở đâu trong constructor -> đầu tiên nhất bên trong constructor của lớp con 

    Override khác overload ở điểm nào -> Override là ghi đề phương thức Overload là nạp chồng tham số.

    Vì sao String không thể bị kế thừa -> Vì String được khai báo là final class, và final mới là thứ chặn kế thừa.

    Method static có override được không -> Không. static thuộc về lớp, không thuộc đối tượng nên không có đa hình

    Animal a = new Dog(); thì a.eat() chạy bản của lớp nào, và vì sao -> Chạy bản của Dog, vì có hai bước:
    Lúc biên dịch: Java kiểm tra theo kiểu biến Animal xem có method eat() không. Có thì cho qua.
    Lúc chạy: Java nhìn vào đối tượng thật là Dog và chạy bản eat() của Dog (gọi là dynamic dispatch).
    Nếu Dog không override eat() thì nó chạy bản kế thừa từ Animal. Không phải “lớp cha gọi lớp Dog”, mà là biến kiểu cha đang giữ đối tượng con.

    Khi nào cần instanceof, và nếu quên thì chuyện gì xảy ra? -> khi lớp con có thêm method khác lớp cha,
    nếu quên instanceof thì lớp cha sẽ không thấy được method đó.
