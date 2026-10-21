import javax.swing.plaf.synth.SynthFormattedTextFieldUI;

public class Main {
    // hàm main.
    public static void main(String[] args){
        Student st1 = new Student("Nguyễn Văn A", 18);
        Student st2 = st1.withAge(17);
        Student st3 = st2.withName("Nguyễn Văn B");
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}