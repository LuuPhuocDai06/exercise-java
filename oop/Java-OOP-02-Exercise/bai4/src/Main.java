import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    // hàm tìm nhân viên có số lương cao nhất trong 1 tháng.
    static double highestSalary(Employee[] list){
        double max = list[0].salary();
        for(int i = 1; i < list.length; i++){
            if (max < list[i].salary()){
                max = list[i].salary();
            }
        }
        return max;
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
        Employee[] employees = {new Manager("Nguyen Văn A", 2500,600), new Developer("Nguyễn Văn B", 2300,100, 5.5), new Intern("Nguyen Văn C", 1800)};
        for(Employee i : employees){
            System.out.println(i);
        }

        System.out.println("\nTong quy lương của nhân viên là "+NumberFormat.getCurrencyInstance(Locale.US).format(totalPayroll(employees)));
        System.out.println("Mức lương cao nhất của một nhân viên trong danh sách là "+NumberFormat.getCurrencyInstance(Locale.US).format(highestSalary(employees)));
    }
}