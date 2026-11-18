import java.util.Objects;

public final class BankAccount {
    private final String owner;
    private final double balance;

    public BankAccount(String owner, double balance){
        if (owner == null) throw new NullPointerException("rỗng");
        if (balance < 0) throw new IllegalArgumentException("số tiền không được âm");
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(balance, that.balance) == 0 && Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, balance);
    }


    // method deposit.
    public BankAccount deposit(double amount){
        if (amount < 0) throw new IllegalArgumentException("Số tiền phải dương");
        return new BankAccount(owner, balance + amount);
    }

    // method withdraw.
    public BankAccount withdraw(double amount){
        if (amount < 0) throw new IllegalArgumentException("Số tiền phải dương");
        if (amount > balance) throw new IllegalArgumentException("Số tiền kh đủ");
        return new BankAccount(owner, balance - amount);
    }

    // method transfer.
    public BankAccount[] transfer(BankAccount to, double amount){
        if (amount < 0) throw new IllegalArgumentException("Số tiền phải dương");
        if (amount > this.balance) throw new IllegalArgumentException("Số tiền kh đủ");
        BankAccount sender = new BankAccount(this.owner, this.balance - amount);
        BankAccount receiver = new BankAccount(to.owner, to.balance + amount);
        return new BankAccount[]{sender, receiver};
    }

    // toString.

    @Override
    public String toString() {
        return String.format("Ten TK: %s - Số dư: %.2f", owner, balance);
    }
}
