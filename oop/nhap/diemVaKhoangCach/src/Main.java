public class Main {
    // Ham tinh hai diem.
    public static double distance(Diem d1, Diem d2){
        return d1.distanceX_Y(d2);
    }

    // ham main.
    public static void main(String[] args){
        Diem a = new Diem(4.5, 5.6);
        Diem b = new Diem(6.0, 8.0);
        Diem c = new Diem(4.5,5.6);

        System.out.println("Toa do 3 diem.");
        System.out.println("A("+a.getX()+", "+a.getY()+")");
        System.out.println("B("+b.getX()+", "+b.getY()+")");
        System.out.println("C("+c.getX()+", "+c.getY()+")");

        System.out.println("Khoang cach giua A va B: "+distance(a, b));
        System.out.println("Khoang cach giua B va c: "+distance(b, c));
        System.out.println("Khoang cach giua A va c: "+distance(a, c));

        // check co trung nhau hay khong..
        System.out.println("A va B co trung nhau khong: "+a.equals(b));
        System.out.println("B va C co trung nhau khong: "+b.equals(c));
        System.out.println("A va C co trung nhau khong: "+a.equals(c));
    }
}