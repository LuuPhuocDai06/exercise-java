public class Main {
    //ham main.
    public static void main(String[] args){
        TaiKhoang tk1 = new TaiKhoang("01234", "Nguyen van A", 50000.0);

        // xem thong tin.
        System.out.println("\nXem thong tin tai khoang.");
        System.out.println(tk1.toString());

        // rut 40000VND.
        System.out.println("\nRut 40000VND");
        tk1.withdraw(40000.0);

        // nap them 10000VND.
        System.out.println("\nNap vao 10000VND.");
        tk1.recharge(10000.0);

        // xem so du.
        System.out.println("Xem so du.");
        System.out.println("So du: "+tk1.getAccountBalance()+"VND");

        // rut 50000.
        System.out.println("\nRut 50000VND.");
        tk1.withdraw(50000.0);

        // nap vao 100000VND.
        System.out.println("\nnap vao 100000VND.");
        tk1.recharge(100000.0);

        // xem so du.
        System.out.println("\nXem so du.");
        System.out.println("So du: "+tk1.getAccountBalance()+"VND");



    }
}