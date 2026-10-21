import java.time.LocalDate;
import java.util.Date;

public class Main {
    // hàm main.
    public static void main(String[] args){
        // giá trị góc.
        int[] bktr = {9, 10};
        Exam e1 = new Exam("Kiem tra", bktr, LocalDate.now());
        System.out.println(e1);

        Exam before = new Exam("Kiem tra", new int[]{9, 10}, LocalDate.of(2026, 10, 1));
        int[] src = {9, 10};
        Exam e = new Exam("Kiem tra", src, LocalDate.of(2026, 10, 1));
        src[0] = 0;
        e.getScores()[1] = 0;
        System.out.println(e.equals(before));              // phải là true
        System.out.println(e.getDate());                   // phải là 2026-10-01
    }
}