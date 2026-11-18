public class Main {
    // hàm main.
    static void main(String[] args){
        BankAccount acc1 = new BankAccount("Nguyen Van A", 200);
        System.out.println(acc1);
        BankAccount acc2 = acc1.deposit(20);
        System.out.println(acc2);
        BankAccount acc3 = acc2.withdraw(15.50);
        System.out.println(acc3);

        BankAccount acc_1 = new BankAccount("Nguyen Van B", 0);
        System.out.println("\nNguyen Van A chuyen cho Nguyen Van B 200");
        System.out.println(acc3);
        System.out.println(acc_1);
        BankAccount[] result = acc3.transfer(acc_1, 200);
        BankAccount r1 = result[0]; // Nguyen Van A
        BankAccount r2 = result[1]; // Nguyen Van B
        System.out.println(r1);
        System.out.println(r2);
    }
}