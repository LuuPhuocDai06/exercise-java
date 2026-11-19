public class Main {
    // hàm tìm nhân viên có số lương cao nhất trong 1 tháng.
    static double totalPayroll(Employee[] list){
        double max = list[0].salary();
        for(int i = 1; i < list.length; i++){
            if (max < list[i].salary()){
                max = list[i].salary();
            }
        }
        return max;
    }

    // hàm main.
    static void main(String[] args){
        Employee[] employees = {new Manager(600), new Developer(100, 5.5), new Intern()};
        for(Employee i : employees){
            System.out.println(i);
        }

        System.out.println("\nMức lương cao nhất của một nhân viên trong danh sách là "+totalPayroll(employees));
    }
}