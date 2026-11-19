import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    // hàm tìm nhân viên có số lương cao nhất trong 1 tháng.
    static void highestSalary(Employee[] list){
        double max = list[0].salary();
        for(int i = 1; i < list.length; i++){
            if (max < list[i].salary()){
                max = list[i].salary();
            }
        }
        boolean check = false;
        for (Employee x : list){
            if (max == x.salary()){
                System.out.print(x.getName());
                check = true;
            }
            if (check) {
                System.out.print(" - ");
                check = false;
            }
        }
        System.out.println("với mức lương: "+NumberFormat.getCurrencyInstance(Locale.US).format(max));
    }

    // hàm tính tổng lương.
    static double totalPayroll(Employee[] list){
        double total = 0;
        for (Employee x : list){
            total += x.salary();
        }
        return total;
    }

    // hàm main.
    static void main(String[] args){
        Employee[] employees = {new Manager("Nguyen Văn A", 2500,350), new Developer("Nguyễn Văn B", 2300,100, 5.5), new Intern("Nguyen Văn C", 1800)
        , new Manager("Nguyen Văn D", 3000, 670)};
        for(Employee i : employees){
            System.out.println(i);
        }

        System.out.println("\nTong quy lương của nhân viên là "+NumberFormat.getCurrencyInstance(Locale.US).format(totalPayroll(employees)));
        System.out.println("Mức lương cao nhất của nhân viên trong danh sách là.");
        highestSalary(employees);
    }
}