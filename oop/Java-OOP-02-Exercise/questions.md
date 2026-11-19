Câu hỏi tự kiểm tra

    super(...) phải nằm ở đâu trong constructor -> đầu tiên nhất bên trong constructor của lớp con 
    Override khác overload ở điểm nào -> Override là ghi đề phương thức Overload là nạp chồng tham số.
    Vì sao String không thể bị kế thừa -> String là kiểu immutable không thể kế thừa.
    Method static có override được không -> không static chỉ dùng ở class đó và khi kế thừa là qua class khác nên không đc
    Animal a = new Dog(); thì a.eat() chạy bản của lớp nào, và vì sao -> Lớp cha, vì lớp cha gọi lớp Dog ra 
    Khi nào cần instanceof, và nếu quên thì chuyện gì xảy ra? -> khi lớp con có thêm method khác mà lớp cha lại gọi tới method đó, nếu không có instanceof thì báo lỗi và không gọi đc vì không tồn tại (java nó nhận diện vậy)
