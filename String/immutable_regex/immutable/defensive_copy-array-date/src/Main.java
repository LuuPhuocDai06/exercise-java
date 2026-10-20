import java.time.LocalDate;
import java.util.Date;

public class Main {
    // hàm main.
    public static void main(String[] args){
        // giá trị góc.
        int[] bktr = {9, 10};
        Exam e1 = new Exam("Kiem tra", bktr, LocalDate.now());
        System.out.println(e1);

        // thay đổi.
        e1.getScores()[0] = 8;
        bktr[0] = 8;
        e1.getDate().setTime(0L);
        System.out.println("\n"+e1);
        // -> không bị thay đổi.
        // Đổi qua LocalDate thì không cần phải copy vì nó đã là immutable.
        // Không cần copy để trả ra nữa ta chỉ cần dùng cái bản copy khi vào để trả ra là đc.
    }
}