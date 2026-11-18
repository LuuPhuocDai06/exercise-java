public class TaiKhoang {
    // cac thuoc tinh.
    private String accountNumber;
    private String accountName;
    private double accountBalance;
    private static final double price = 50000.0;

    // cac phuong thuc.
    public TaiKhoang(){

    }

    public TaiKhoang(String accountNumber, String accountName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    // getter va setter.
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountBalance(){
        return this.accountBalance;
    }

    // ham nap tien.
    public void recharge(double number){
        if(number < price){ // so muc mac dinh nap tien.
            System.out.println("So tien nap vao khong du muc! vui long nap vao >= 50000VND.");
        }
        else if(number >= price){
            this.accountBalance += number;
            System.out.println("Nap thanh cong "+number+"VND!");
        }
    }

    // ham rut tien.
    public void withdraw(double number){
        if(number < price){
            System.out.println("Vui long rut voi menh gia cao hon (>= 50000).");
        }

        if(number > this.accountBalance){
            System.out.println("So du cua ban khong du de rut "+number+"VND! vui long chon menh gia thap hon.");
        }
        if(number <= this.getAccountBalance() && number >= price){
            System.out.println("Rut thanh cong "+number+"VND!");
            this.accountBalance -= number;
        }
    }

    // toString.
    @Override
    public String toString() {
        return "\nTai khoang."+
                "\nSo tai khoang: "+this.getAccountNumber()+
                "\nTen chu: "+this.getAccountName()+
                "\nSo du: "+this.getAccountBalance()+"VND";
    }
}
